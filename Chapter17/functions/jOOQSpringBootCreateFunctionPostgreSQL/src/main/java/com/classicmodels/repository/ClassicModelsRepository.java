package com.classicmodels.repository;

import org.jooq.DSLContext;
import org.jooq.Parameter;
import static org.jooq.impl.DSL.begin;
import static org.jooq.impl.DSL.function;
import static org.jooq.impl.DSL.in;
import static org.jooq.impl.DSL.inOut;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.return_;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.val;
import static org.jooq.impl.SQLDataType.INTEGER;
import static org.jooq.impl.SQLDataType.REAL;
import static org.jooq.impl.SQLDataType.RECORD;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    @Transactional
    public void createScalarFunction() {

        Parameter<Integer> quantity = in("quantity", INTEGER);
        Parameter<Float> list_price = in("list_price", REAL);
        Parameter<Float> discount = in("discount", REAL);

        // or, use ctx.dropFunctionIfExists() and createFunction()
        ctx.createOrReplaceFunction("net_price_each_jooq")
                .parameters(quantity, list_price, discount)
                .returns(REAL)
                .deterministic()
                .as(return_(quantity.mul(list_price).mul(inline(1).minus(discount))))
                .execute();
    }

    public void callScalarFunction() {

        // call this function (plain SQL)
        float result = ctx.select(function(name("net_price_each_jooq"),
                REAL, val(10), val(20.45f), val(0.33f)))
                .fetchOneInto(Float.class);

        System.out.println("Result: " + result);

        // calling the previously created functions via the generated code
        // can be done as you saw in the application jOOQSpringBootSFMySQL
    }
    
    @Transactional
    public void createRecordFunction() {
        
        Parameter<Integer> x = inOut("x", INTEGER);
        Parameter<Integer> y = inOut("y", INTEGER);
        
        // or, use ctx.dropFunctionIfExists() and createFunction()
        ctx.createOrReplaceFunction("swap_jooq")
                .parameters(x, y)                 
                .returns(RECORD)                
                .as(begin(select(x, y).into(y, x)))
                .execute();
    }
    
    public void callRecordFunction() {
        
        // call this function (plain SQL)
        var result = ctx.select(function(name("swap_jooq"),
                RECORD, val(1), val(2)))
          .fetchOne();

        System.out.println("Result:\n" + result);

        // calling the previously created functions via the generated code
        // can be done as you saw in the application jOOQSpringBootSFMySQL        
    }
}
