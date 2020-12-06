/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.OfficeHasManager;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfficeHasManagerRecord extends UpdatableRecordImpl<OfficeHasManagerRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>office_has_manager.offices_office_code</code>.
     */
    public void setOfficesOfficeCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>office_has_manager.offices_office_code</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getOfficesOfficeCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>office_has_manager.managers_manager_id</code>.
     */
    public void setManagersManagerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>office_has_manager.managers_manager_id</code>.
     */
    @NotNull
    public Long getManagersManagerId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return OfficeHasManager.OFFICE_HAS_MANAGER.OFFICES_OFFICE_CODE;
    }

    @Override
    public Field<Long> field2() {
        return OfficeHasManager.OFFICE_HAS_MANAGER.MANAGERS_MANAGER_ID;
    }

    @Override
    public String component1() {
        return getOfficesOfficeCode();
    }

    @Override
    public Long component2() {
        return getManagersManagerId();
    }

    @Override
    public String value1() {
        return getOfficesOfficeCode();
    }

    @Override
    public Long value2() {
        return getManagersManagerId();
    }

    @Override
    public OfficeHasManagerRecord value1(String value) {
        setOfficesOfficeCode(value);
        return this;
    }

    @Override
    public OfficeHasManagerRecord value2(Long value) {
        setManagersManagerId(value);
        return this;
    }

    @Override
    public OfficeHasManagerRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OfficeHasManagerRecord
     */
    public OfficeHasManagerRecord() {
        super(OfficeHasManager.OFFICE_HAS_MANAGER);
    }

    /**
     * Create a detached, initialised OfficeHasManagerRecord
     */
    public OfficeHasManagerRecord(String officesOfficeCode, Long managersManagerId) {
        super(OfficeHasManager.OFFICE_HAS_MANAGER);

        setOfficesOfficeCode(officesOfficeCode);
        setManagersManagerId(managersManagerId);
    }
}
