package com.classicmodels.jooq.config;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.MatcherRule;
import org.jooq.meta.jaxb.MatcherTransformType;
import org.jooq.meta.jaxb.Matchers;
import org.jooq.meta.jaxb.MatchersTableType;
import org.jooq.meta.jaxb.Strategy;
import org.jooq.meta.jaxb.Target;

public class JooqConfig {

    public static void main(String[] args) throws Exception {

        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("org.postgresql.Driver")
                        .withUrl("jdbc:postgresql://localhost:5432/classicmodels")
                        .withUser("postgres")
                        .withPassword("root"))
                .withGenerator(new Generator()
                        .withName("org.jooq.codegen.KotlinGenerator")
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.postgres.PostgresDatabase")
                                .withSchemaVersionProvider("SELECT MAX(\"version\") FROM \"flyway_schema_history\"")
                                .withIncludes(".*")
                                .withExcludes("flyway_schema_history | akeys | avals | defined | delete.*\"\n" +
"                                        + \" | department_topic_arr | dup | employee_office_arr | exist.*\"\n" +
"                                        + \" | fetchval | get_.* | ghstore.* | gin.* | hs.* | hstore.*\"\n" +
"                                        + \" | isdefined | isexists | make_array | new_salary | populate_record\"\n" +
"                                        + \" | sale_price | slice.* | swap | tconvert | update_msrp\"\n" +
"                                        + \" | evaluation_criteria | rate_type | vat_type | .*_master | each\"\n" +
"                                        + \" | skeys | svals | top_three_sales_per_employee | product_of_product_line")
                                .withInputSchema("public")
                        )
                        .withGenerate(new Generate()
                                .withDaos(true)
                                .withValidationAnnotations(Boolean.TRUE)
                                .withSpringAnnotations(Boolean.TRUE)                                
                                .withDeprecationOnUnknownTypes(Boolean.FALSE)
                                .withPojosAsKotlinDataClasses(Boolean.TRUE)
                        )
                        .withStrategy(new Strategy()
                                .withMatchers(new Matchers()
                                        .withTables(new MatchersTableType()
                                                .withPojoClass(new MatcherRule()
                                                        .withExpression("Jooq_$0")
                                                        .withTransform(MatcherTransformType.PASCAL))
                                                .withDaoClass(new MatcherRule()
                                                        .withExpression("$0_Repository")
                                                        .withTransform(MatcherTransformType.PASCAL))))
                        )
                        .withTarget(new Target()
                                .withPackageName("jooq.generated")
                                .withDirectory(System.getProperty("user.dir").endsWith("webapp")
                                        ? "target/generated-sources"
                                        : "webapp/target/generated-sources")));

        GenerationTool.generate(configuration);
    }
}
