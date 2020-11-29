/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import java.time.LocalDate;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Order;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.1"
    },
    date = "2020-10-19T13:27:12.864Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record7<Long, LocalDate, LocalDate, LocalDate, String, String, Long> {

    private static final long serialVersionUID = 1982485670;

    /**
     * Setter for <code>classicmodels.order.order_id</code>.
     */
    public void setOrderId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.order.order_id</code>.
     */
    public Long getOrderId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>classicmodels.order.order_date</code>.
     */
    public void setOrderDate(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.order.order_date</code>.
     */
    @NotNull
    public LocalDate getOrderDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>classicmodels.order.required_date</code>.
     */
    public void setRequiredDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.order.required_date</code>.
     */
    @NotNull
    public LocalDate getRequiredDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>classicmodels.order.shipped_date</code>.
     */
    public void setShippedDate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.order.shipped_date</code>.
     */
    public LocalDate getShippedDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>classicmodels.order.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>classicmodels.order.status</code>.
     */
    @NotNull
    @Size(max = 15)
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>classicmodels.order.comments</code>.
     */
    public void setComments(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>classicmodels.order.comments</code>.
     */
    @Size(max = 65535)
    public String getComments() {
        return (String) get(5);
    }

    /**
     * Setter for <code>classicmodels.order.customer_number</code>.
     */
    public void setCustomerNumber(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>classicmodels.order.customer_number</code>.
     */
    @NotNull
    public Long getCustomerNumber() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDate, LocalDate, LocalDate, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, LocalDate, LocalDate, LocalDate, String, String, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Order.ORDER.ORDER_ID;
    }

    @Override
    public Field<LocalDate> field2() {
        return Order.ORDER.ORDER_DATE;
    }

    @Override
    public Field<LocalDate> field3() {
        return Order.ORDER.REQUIRED_DATE;
    }

    @Override
    public Field<LocalDate> field4() {
        return Order.ORDER.SHIPPED_DATE;
    }

    @Override
    public Field<String> field5() {
        return Order.ORDER.STATUS;
    }

    @Override
    public Field<String> field6() {
        return Order.ORDER.COMMENTS;
    }

    @Override
    public Field<Long> field7() {
        return Order.ORDER.CUSTOMER_NUMBER;
    }

    @Override
    public Long component1() {
        return getOrderId();
    }

    @Override
    public LocalDate component2() {
        return getOrderDate();
    }

    @Override
    public LocalDate component3() {
        return getRequiredDate();
    }

    @Override
    public LocalDate component4() {
        return getShippedDate();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getComments();
    }

    @Override
    public Long component7() {
        return getCustomerNumber();
    }

    @Override
    public Long value1() {
        return getOrderId();
    }

    @Override
    public LocalDate value2() {
        return getOrderDate();
    }

    @Override
    public LocalDate value3() {
        return getRequiredDate();
    }

    @Override
    public LocalDate value4() {
        return getShippedDate();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getComments();
    }

    @Override
    public Long value7() {
        return getCustomerNumber();
    }

    @Override
    public OrderRecord value1(Long value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrderRecord value2(LocalDate value) {
        setOrderDate(value);
        return this;
    }

    @Override
    public OrderRecord value3(LocalDate value) {
        setRequiredDate(value);
        return this;
    }

    @Override
    public OrderRecord value4(LocalDate value) {
        setShippedDate(value);
        return this;
    }

    @Override
    public OrderRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public OrderRecord value6(String value) {
        setComments(value);
        return this;
    }

    @Override
    public OrderRecord value7(Long value) {
        setCustomerNumber(value);
        return this;
    }

    @Override
    public OrderRecord values(Long value1, LocalDate value2, LocalDate value3, LocalDate value4, String value5, String value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Long orderId, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, String status, String comments, Long customerNumber) {
        super(Order.ORDER);

        set(0, orderId);
        set(1, orderDate);
        set(2, requiredDate);
        set(3, shippedDate);
        set(4, status);
        set(5, comments);
        set(6, customerNumber);
    }
}
