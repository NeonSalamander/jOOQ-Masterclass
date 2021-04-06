package com.classicmodels.repository;

import java.util.List;
import jooq.generated.tables.pojos.ProductMaster;
import static jooq.generated.tables.ProductMaster.PRODUCT_MASTER;
import org.jooq.DSLContext;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.rowNumber;
import static org.jooq.impl.DSL.select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    public List<ProductMaster> fetchProductMasterPage(int start, int end) {

        var result = ctx.select().from(select(PRODUCT_MASTER.PRODUCT_LINE, 
                PRODUCT_MASTER.PRODUCT_NAME, PRODUCT_MASTER.PRODUCT_SCALE,
                rowNumber().over().orderBy(PRODUCT_MASTER.PRODUCT_LINE).as("rowNum"))
                .from(PRODUCT_MASTER).asTable("t"))
                .where(field("t.rowNum").between(start, end))
                .fetchInto(ProductMaster.class);

        return result;
    }    
}
