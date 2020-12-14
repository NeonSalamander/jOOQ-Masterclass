/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import jooq.generated.DefaultSchema;
import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.tables.records.EmployeeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>employee</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>employee.employee_number</code>.
     */
    public final TableField<EmployeeRecord, Long> EMPLOYEE_NUMBER = createField(DSL.name("employee_number"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>employee.last_name</code>.
     */
    public final TableField<EmployeeRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>employee.first_name</code>.
     */
    public final TableField<EmployeeRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>employee.extension</code>.
     */
    public final TableField<EmployeeRecord, String> EXTENSION = createField(DSL.name("extension"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>employee.email</code>.
     */
    public final TableField<EmployeeRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>employee.office_code</code>.
     */
    public final TableField<EmployeeRecord, String> OFFICE_CODE = createField(DSL.name("office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>employee.salary</code>.
     */
    public final TableField<EmployeeRecord, Integer> SALARY = createField(DSL.name("salary"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>employee.reports_to</code>.
     */
    public final TableField<EmployeeRecord, Long> REPORTS_TO = createField(DSL.name("reports_to"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>employee.job_title</code>.
     */
    public final TableField<EmployeeRecord, String> JOB_TITLE = createField(DSL.name("job_title"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    private Employee(Name alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>employee</code> table reference
     */
    public Employee(String alias) {
        this(DSL.name(alias), EMPLOYEE);
    }

    /**
     * Create an aliased <code>employee</code> table reference
     */
    public Employee(Name alias) {
        this(alias, EMPLOYEE);
    }

    /**
     * Create a <code>employee</code> table reference
     */
    public Employee() {
        this(DSL.name("employee"), null);
    }

    public <O extends Record> Employee(Table<O> child, ForeignKey<O, EmployeeRecord> key) {
        super(child, key, EMPLOYEE);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.OFFICE_CODE, Indexes.REPORTS_TO);
    }

    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<UniqueKey<EmployeeRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeeRecord>>asList(Keys.CONSTRAINT_4);
    }

    @Override
    public List<ForeignKey<EmployeeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EmployeeRecord, ?>>asList(Keys.EMPLOYEES_IBFK_2, Keys.EMPLOYEES_IBFK_1);
    }

    public Office office() {
        return new Office(this, Keys.EMPLOYEES_IBFK_2);
    }

    public Employee employee() {
        return new Employee(this, Keys.EMPLOYEES_IBFK_1);
    }

    @Override
    public Employee as(String alias) {
        return new Employee(DSL.name(alias), this);
    }

    @Override
    public Employee as(Name alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(String name) {
        return new Employee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Name name) {
        return new Employee(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, Integer, Long, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
