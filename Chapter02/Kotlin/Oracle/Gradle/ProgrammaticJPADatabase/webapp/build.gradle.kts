import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.language.jvm.tasks.ProcessResources

plugins {
    id("application")
    id("org.springframework.boot") version "2.5.7"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("nu.studer.jooq") version "6.0.1"
    id("org.flywaydb.flyway") version "7.7.3"
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.spring") version "1.6.0"
}

val schemaVersion by extra { "1" }

group = "com.classicmodels"
version = "1.0"
java.sourceCompatibility = JavaVersion.VERSION_17

application {
    mainClass.value("com.classicmodels.MainApplicationKt")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(project(":entities"))
    implementation("org.jooq:jooq")
    implementation("com.oracle.database.jdbc:ojdbc8")
    implementation("com.oracle.database.jdbc:ucp")
    implementation("org.flywaydb:flyway-core")
}

tasks {
  "processResources"(ProcessResources::class) {
    filesMatching("application.properties") {
      expand(project.properties)
    }
  }
}

flyway {
    driver = project.properties["driverClassName"].toString()
    url = project.properties["url"].toString()
    user = project.properties["username"].toString()
    password = project.properties["password"].toString()
    locations = arrayOf("filesystem:./../../../../../../db/migration/min/oracle")
    baselineOnMigrate = true
}

jooq {
    version.set(project.properties["jooq"].toString())
    edition.set(nu.studer.gradle.jooq.JooqEdition.TRIAL_JAVA_8)
}

task("runProgrammaticGenerator", JavaExec::class) {

    dependsOn("flywayMigrate")
    dependsOn(":entities:compileJava")

    val h2jdbc by configurations.creating
    val codegen by configurations.creating
    val metaext by configurations.creating
    val sbjpa by configurations.creating

    dependencies {
       h2jdbc("com.h2database:h2")
       codegen("org.jooq:jooq-codegen")
       metaext("org.jooq:jooq-meta-extensions-hibernate")
       sbjpa("org.springframework.boot:spring-boot-starter-data-jpa")
    }

    classpath = files(arrayOf(
         "${rootDir}/entities/build/classes/java/main",
         codegen, h2jdbc, metaext, sbjpa
    ))

    mainClass.value("com.classicmodels.jooq.config.JooqConfig")
}

java.sourceSets["main"].java {
    srcDir("build/generated-sources/jooq")
    srcDir("src/main/kotlin")
}

tasks.withType<KotlinCompile> {
    dependsOn("runProgrammaticGenerator")
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}