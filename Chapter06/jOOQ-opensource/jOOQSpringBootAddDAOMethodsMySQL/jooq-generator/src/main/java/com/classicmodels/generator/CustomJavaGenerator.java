package com.classicmodels.generator;

import java.time.LocalDate;
import java.util.List;
import org.jooq.codegen.GeneratorStrategy.Mode;
import org.jooq.codegen.JavaGenerator;
import org.jooq.codegen.JavaWriter;
import org.jooq.meta.TableDefinition;

public class CustomJavaGenerator extends JavaGenerator {

    @Override
    protected void generateDaoClassFooter(TableDefinition table, JavaWriter out) {

        final String pType = out.ref(getStrategy().getFullJavaClassName(table, Mode.POJO));

        // add a method common to all DAOs
        out.javadoc("Fetch the number of records limited by <code>value</code>");
        out.println("public %s<%s> fetchLimitedTo(%s value) {", out.ref(List.class), pType, Integer.class);
        out.println("return ctx().selectFrom(%s)", getStrategy().getFullJavaIdentifier(table));
        out.println(".limit(value)");
        out.println(".fetch(mapper());");
        out.println("}");

        // add a method specific to Order DAO
        if (table.getName().equals("order")) {
            out.println();
            out.javadoc("Fetch customers having credit limit greater than <code>value</code>");
            out.println("public %s<%s> fetchStatusAndOrderDate(%s statusVal, %s orderDateVal) {",
                     out.ref(List.class), pType, String.class, out.ref(LocalDate.class));
            out.println("return ctx().selectFrom(%s)", getStrategy().getFullJavaIdentifier(table));
            out.println(".where(%s.eq(statusVal))", getStrategy().getFullJavaIdentifier(table.getColumn("status")));
            out.println(".and(%s.ge(orderDateVal))", getStrategy().getFullJavaIdentifier(table.getColumn("order_date")));
            out.println(".fetch(mapper());");
            out.println("}");
        }
    }
}
