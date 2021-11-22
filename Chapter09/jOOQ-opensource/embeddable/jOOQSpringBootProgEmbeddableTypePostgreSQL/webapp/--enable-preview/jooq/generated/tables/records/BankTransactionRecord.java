/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.BankTransaction;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BankTransactionRecord extends UpdatableRecordImpl<BankTransactionRecord> implements Record9<Integer, String, String, BigDecimal, LocalDateTime, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.bank_transaction.transaction_id</code>.
     */
    public void setTransactionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bank_transaction.transaction_id</code>.
     */
    public Integer getTransactionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.bank_transaction.bank_name</code>.
     */
    public void setBankName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bank_transaction.bank_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getBankName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.bank_transaction.bank_iban</code>.
     */
    public void setBankIban(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bank_transaction.bank_iban</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getBankIban() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bank_transaction.transfer_amount</code>.
     */
    public void setTransferAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bank_transaction.transfer_amount</code>.
     */
    @NotNull
    public BigDecimal getTransferAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.bank_transaction.caching_date</code>.
     */
    public void setCachingDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bank_transaction.caching_date</code>.
     */
    public LocalDateTime getCachingDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.bank_transaction.customer_number</code>.
     */
    public void setCustomerNumber(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bank_transaction.customer_number</code>.
     */
    @NotNull
    public Long getCustomerNumber() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.bank_transaction.check_number</code>.
     */
    public void setCheckNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bank_transaction.check_number</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getCheckNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.bank_transaction.card_type</code>.
     */
    public void setCardType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bank_transaction.card_type</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getCardType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.bank_transaction.status</code>.
     */
    public void setStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bank_transaction.status</code>.
     */
    @Size(max = 50)
    public String getStatus() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, BigDecimal, LocalDateTime, Long, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, BigDecimal, LocalDateTime, Long, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BankTransaction.BANK_TRANSACTION.TRANSACTION_ID;
    }

    @Override
    public Field<String> field2() {
        return BankTransaction.BANK_TRANSACTION.BANK_NAME;
    }

    @Override
    public Field<String> field3() {
        return BankTransaction.BANK_TRANSACTION.BANK_IBAN;
    }

    @Override
    public Field<BigDecimal> field4() {
        return BankTransaction.BANK_TRANSACTION.TRANSFER_AMOUNT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return BankTransaction.BANK_TRANSACTION.CACHING_DATE;
    }

    @Override
    public Field<Long> field6() {
        return BankTransaction.BANK_TRANSACTION.CUSTOMER_NUMBER;
    }

    @Override
    public Field<String> field7() {
        return BankTransaction.BANK_TRANSACTION.CHECK_NUMBER;
    }

    @Override
    public Field<String> field8() {
        return BankTransaction.BANK_TRANSACTION.CARD_TYPE;
    }

    @Override
    public Field<String> field9() {
        return BankTransaction.BANK_TRANSACTION.STATUS;
    }

    @Override
    public Integer component1() {
        return getTransactionId();
    }

    @Override
    public String component2() {
        return getBankName();
    }

    @Override
    public String component3() {
        return getBankIban();
    }

    @Override
    public BigDecimal component4() {
        return getTransferAmount();
    }

    @Override
    public LocalDateTime component5() {
        return getCachingDate();
    }

    @Override
    public Long component6() {
        return getCustomerNumber();
    }

    @Override
    public String component7() {
        return getCheckNumber();
    }

    @Override
    public String component8() {
        return getCardType();
    }

    @Override
    public String component9() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getTransactionId();
    }

    @Override
    public String value2() {
        return getBankName();
    }

    @Override
    public String value3() {
        return getBankIban();
    }

    @Override
    public BigDecimal value4() {
        return getTransferAmount();
    }

    @Override
    public LocalDateTime value5() {
        return getCachingDate();
    }

    @Override
    public Long value6() {
        return getCustomerNumber();
    }

    @Override
    public String value7() {
        return getCheckNumber();
    }

    @Override
    public String value8() {
        return getCardType();
    }

    @Override
    public String value9() {
        return getStatus();
    }

    @Override
    public BankTransactionRecord value1(Integer value) {
        setTransactionId(value);
        return this;
    }

    @Override
    public BankTransactionRecord value2(String value) {
        setBankName(value);
        return this;
    }

    @Override
    public BankTransactionRecord value3(String value) {
        setBankIban(value);
        return this;
    }

    @Override
    public BankTransactionRecord value4(BigDecimal value) {
        setTransferAmount(value);
        return this;
    }

    @Override
    public BankTransactionRecord value5(LocalDateTime value) {
        setCachingDate(value);
        return this;
    }

    @Override
    public BankTransactionRecord value6(Long value) {
        setCustomerNumber(value);
        return this;
    }

    @Override
    public BankTransactionRecord value7(String value) {
        setCheckNumber(value);
        return this;
    }

    @Override
    public BankTransactionRecord value8(String value) {
        setCardType(value);
        return this;
    }

    @Override
    public BankTransactionRecord value9(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public BankTransactionRecord values(Integer value1, String value2, String value3, BigDecimal value4, LocalDateTime value5, Long value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankTransactionRecord
     */
    public BankTransactionRecord() {
        super(BankTransaction.BANK_TRANSACTION);
    }

    /**
     * Create a detached, initialised BankTransactionRecord
     */
    public BankTransactionRecord(Integer transactionId, String bankName, String bankIban, BigDecimal transferAmount, LocalDateTime cachingDate, Long customerNumber, String checkNumber, String cardType, String status) {
        super(BankTransaction.BANK_TRANSACTION);

        setTransactionId(transactionId);
        setBankName(bankName);
        setBankIban(bankIban);
        setTransferAmount(transferAmount);
        setCachingDate(cachingDate);
        setCustomerNumber(customerNumber);
        setCheckNumber(checkNumber);
        setCardType(cardType);
        setStatus(status);
    }
}
