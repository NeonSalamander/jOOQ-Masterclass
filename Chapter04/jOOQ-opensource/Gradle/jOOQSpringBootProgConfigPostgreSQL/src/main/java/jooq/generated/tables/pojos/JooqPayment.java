/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class JooqPayment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          customerNumber;
    private String        checkNumber;
    private LocalDateTime paymentDate;
    private BigDecimal    invoiceAmount;
    private LocalDateTime cachingDate;

    public JooqPayment() {}

    public JooqPayment(JooqPayment value) {
        this.customerNumber = value.customerNumber;
        this.checkNumber = value.checkNumber;
        this.paymentDate = value.paymentDate;
        this.invoiceAmount = value.invoiceAmount;
        this.cachingDate = value.cachingDate;
    }

    public JooqPayment(
        Long          customerNumber,
        String        checkNumber,
        LocalDateTime paymentDate,
        BigDecimal    invoiceAmount,
        LocalDateTime cachingDate
    ) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.invoiceAmount = invoiceAmount;
        this.cachingDate = cachingDate;
    }

    /**
     * Getter for <code>public.payment.customer_number</code>.
     */
    @NotNull
    public Long getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * Setter for <code>public.payment.customer_number</code>.
     */
    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * Getter for <code>public.payment.check_number</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getCheckNumber() {
        return this.checkNumber;
    }

    /**
     * Setter for <code>public.payment.check_number</code>.
     */
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * Getter for <code>public.payment.payment_date</code>.
     */
    @NotNull
    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for <code>public.payment.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Getter for <code>public.payment.invoice_amount</code>.
     */
    @NotNull
    public BigDecimal getInvoiceAmount() {
        return this.invoiceAmount;
    }

    /**
     * Setter for <code>public.payment.invoice_amount</code>.
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * Getter for <code>public.payment.caching_date</code>.
     */
    public LocalDateTime getCachingDate() {
        return this.cachingDate;
    }

    /**
     * Setter for <code>public.payment.caching_date</code>.
     */
    public void setCachingDate(LocalDateTime cachingDate) {
        this.cachingDate = cachingDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqPayment (");

        sb.append(customerNumber);
        sb.append(", ").append(checkNumber);
        sb.append(", ").append(paymentDate);
        sb.append(", ").append(invoiceAmount);
        sb.append(", ").append(cachingDate);

        sb.append(")");
        return sb.toString();
    }
}
