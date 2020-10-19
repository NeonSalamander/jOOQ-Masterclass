/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.1"
    },
    date = "2020-10-19T13:52:35.609Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqOrderdetail implements Serializable {

    private static final long serialVersionUID = 1635874871;

    private Long       orderId;
    private Long       productId;
    private Integer    quantityOrdered;
    private BigDecimal priceEach;
    private Short      orderLineNumber;

    public JooqOrderdetail() {}

    public JooqOrderdetail(JooqOrderdetail value) {
        this.orderId = value.orderId;
        this.productId = value.productId;
        this.quantityOrdered = value.quantityOrdered;
        this.priceEach = value.priceEach;
        this.orderLineNumber = value.orderLineNumber;
    }

    public JooqOrderdetail(
        Long       orderId,
        Long       productId,
        Integer    quantityOrdered,
        BigDecimal priceEach,
        Short      orderLineNumber
    ) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    @NotNull
    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @NotNull
    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @NotNull
    public Integer getQuantityOrdered() {
        return this.quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    @NotNull
    public BigDecimal getPriceEach() {
        return this.priceEach;
    }

    public void setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
    }

    @NotNull
    public Short getOrderLineNumber() {
        return this.orderLineNumber;
    }

    public void setOrderLineNumber(Short orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqOrderdetail (");

        sb.append(orderId);
        sb.append(", ").append(productId);
        sb.append(", ").append(quantityOrdered);
        sb.append(", ").append(priceEach);
        sb.append(", ").append(orderLineNumber);

        sb.append(")");
        return sb.toString();
    }
}
