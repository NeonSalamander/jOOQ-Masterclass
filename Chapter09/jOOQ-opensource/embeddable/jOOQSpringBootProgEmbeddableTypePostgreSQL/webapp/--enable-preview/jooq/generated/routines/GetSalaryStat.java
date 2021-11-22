/*
 * This file is generated by jOOQ.
 */
package jooq.generated.routines;


import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import jooq.generated.Public;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetSalaryStat extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.get_salary_stat.min_sal</code>.
     */
    public static final Parameter<Integer> MIN_SAL = Internal.createParameter("min_sal", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.get_salary_stat.max_sal</code>.
     */
    public static final Parameter<Integer> MAX_SAL = Internal.createParameter("max_sal", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.get_salary_stat.avg_sal</code>.
     */
    public static final Parameter<BigDecimal> AVG_SAL = Internal.createParameter("avg_sal", SQLDataType.NUMERIC, false, false);

    /**
     * Create a new routine call instance
     */
    public GetSalaryStat() {
        super("get_salary_stat", Public.PUBLIC);

        addOutParameter(MIN_SAL);
        addOutParameter(MAX_SAL);
        addOutParameter(AVG_SAL);
    }

    /**
     * Get the <code>min_sal</code> parameter OUT value from the routine
     */
    public Integer getMinSal() {
        return get(MIN_SAL);
    }

    /**
     * Get the <code>max_sal</code> parameter OUT value from the routine
     */
    public Integer getMaxSal() {
        return get(MAX_SAL);
    }

    /**
     * Get the <code>avg_sal</code> parameter OUT value from the routine
     */
    public BigDecimal getAvgSal() {
        return get(AVG_SAL);
    }
}
