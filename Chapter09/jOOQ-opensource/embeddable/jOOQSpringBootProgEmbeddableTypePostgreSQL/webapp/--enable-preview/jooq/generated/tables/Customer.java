/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.CustomerRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>public.customer.customer_number</code>.
     */
    public final TableField<CustomerRecord, Long> CUSTOMER_NUMBER = createField(DSL.name("customer_number"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.customer.customer_name</code>.
     */
    public final TableField<CustomerRecord, String> CUSTOMER_NAME = createField(DSL.name("customer_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.customer.contact_last_name</code>.
     */
    public final TableField<CustomerRecord, String> CONTACT_LAST_NAME = createField(DSL.name("contact_last_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.customer.contact_first_name</code>.
     */
    public final TableField<CustomerRecord, String> CONTACT_FIRST_NAME = createField(DSL.name("contact_first_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.customer.phone</code>.
     */
    public final TableField<CustomerRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.customer.sales_rep_employee_number</code>.
     */
    public final TableField<CustomerRecord, Long> SALES_REP_EMPLOYEE_NUMBER = createField(DSL.name("sales_rep_employee_number"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.customer.credit_limit</code>.
     */
    public final TableField<CustomerRecord, BigDecimal> CREDIT_LIMIT = createField(DSL.name("credit_limit"), SQLDataType.NUMERIC(10, 2).defaultValue(DSL.field("NULL::numeric", SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>public.customer.first_buy_date</code>.
     */
    public final TableField<CustomerRecord, Integer> FIRST_BUY_DATE = createField(DSL.name("first_buy_date"), SQLDataType.INTEGER, this, "");

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    /**
     * Create a <code>public.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    public <O extends Record> Customer(Table<O> child, ForeignKey<O, CustomerRecord> key) {
        super(child, key, CUSTOMER);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<CustomerRecord, Long> getIdentity() {
        return (Identity<CustomerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.CUSTOMER_PK;
    }

    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.CUSTOMER_PK, Keys.CUSTOMER_NAME_UK);
    }

    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CustomerRecord, ?>>asList(Keys.CUSTOMER__CUSTOMER_EMPLOYEE_FK);
    }

    public Employee employee() {
        return new Employee(this, Keys.CUSTOMER__CUSTOMER_EMPLOYEE_FK);
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, Long, BigDecimal, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
