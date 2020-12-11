/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.DepartmentRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Department extends TableImpl<DepartmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.department</code>
     */
    public static final Department DEPARTMENT = new Department();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartmentRecord> getRecordType() {
        return DepartmentRecord.class;
    }

    /**
     * The column <code>public.department.department_id</code>.
     */
    public final TableField<DepartmentRecord, Integer> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.department.name</code>.
     */
    public final TableField<DepartmentRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.department.phone</code>.
     */
    public final TableField<DepartmentRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.department.code</code>.
     */
    public final TableField<DepartmentRecord, Short> CODE = createField(DSL.name("code"), SQLDataType.SMALLINT.defaultValue(DSL.field("1", SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.department.office_code</code>.
     */
    public final TableField<DepartmentRecord, String> OFFICE_CODE = createField(DSL.name("office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    private Department(Name alias, Table<DepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Department(Name alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.department</code> table reference
     */
    public Department(String alias) {
        this(DSL.name(alias), DEPARTMENT);
    }

    /**
     * Create an aliased <code>public.department</code> table reference
     */
    public Department(Name alias) {
        this(alias, DEPARTMENT);
    }

    /**
     * Create a <code>public.department</code> table reference
     */
    public Department() {
        this(DSL.name("department"), null);
    }

    public <O extends Record> Department(Table<O> child, ForeignKey<O, DepartmentRecord> key) {
        super(child, key, DEPARTMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.OFFICE_CODE_DEP);
    }

    @Override
    public Identity<DepartmentRecord, Integer> getIdentity() {
        return (Identity<DepartmentRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DepartmentRecord> getPrimaryKey() {
        return Keys.DEPARTMENT_PKEY;
    }

    @Override
    public List<UniqueKey<DepartmentRecord>> getKeys() {
        return Arrays.<UniqueKey<DepartmentRecord>>asList(Keys.DEPARTMENT_PKEY);
    }

    @Override
    public List<ForeignKey<DepartmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DepartmentRecord, ?>>asList(Keys.DEPARTMENT__DEPARTMENT_IBFK_1);
    }

    public Office office() {
        return new Office(this, Keys.DEPARTMENT__DEPARTMENT_IBFK_1);
    }

    @Override
    public Department as(String alias) {
        return new Department(DSL.name(alias), this);
    }

    @Override
    public Department as(Name alias) {
        return new Department(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(String name) {
        return new Department(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(Name name) {
        return new Department(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Short, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
