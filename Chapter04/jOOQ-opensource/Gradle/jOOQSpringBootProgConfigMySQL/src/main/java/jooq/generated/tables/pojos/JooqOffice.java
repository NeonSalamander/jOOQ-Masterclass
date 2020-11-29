/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class JooqOffice implements Serializable {

    private static final long serialVersionUID = 1530132102;

    private String officeCode;
    private String city;
    private String phone;
    private String addressLineFirst;
    private String addressLineSecond;
    private String state;
    private String country;
    private String postalCode;
    private String territory;

    public JooqOffice() {}

    public JooqOffice(JooqOffice value) {
        this.officeCode = value.officeCode;
        this.city = value.city;
        this.phone = value.phone;
        this.addressLineFirst = value.addressLineFirst;
        this.addressLineSecond = value.addressLineSecond;
        this.state = value.state;
        this.country = value.country;
        this.postalCode = value.postalCode;
        this.territory = value.territory;
    }

    public JooqOffice(
        String officeCode,
        String city,
        String phone,
        String addressLineFirst,
        String addressLineSecond,
        String state,
        String country,
        String postalCode,
        String territory
    ) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addressLineFirst = addressLineFirst;
        this.addressLineSecond = addressLineSecond;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.territory = territory;
    }

    @NotNull
    @Size(max = 10)
    public String getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    @NotNull
    @Size(max = 50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @NotNull
    @Size(max = 50)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @NotNull
    @Size(max = 50)
    public String getAddressLineFirst() {
        return this.addressLineFirst;
    }

    public void setAddressLineFirst(String addressLineFirst) {
        this.addressLineFirst = addressLineFirst;
    }

    @Size(max = 50)
    public String getAddressLineSecond() {
        return this.addressLineSecond;
    }

    public void setAddressLineSecond(String addressLineSecond) {
        this.addressLineSecond = addressLineSecond;
    }

    @Size(max = 50)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @NotNull
    @Size(max = 50)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @NotNull
    @Size(max = 15)
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @NotNull
    @Size(max = 10)
    public String getTerritory() {
        return this.territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JooqOffice (");

        sb.append(officeCode);
        sb.append(", ").append(city);
        sb.append(", ").append(phone);
        sb.append(", ").append(addressLineFirst);
        sb.append(", ").append(addressLineSecond);
        sb.append(", ").append(state);
        sb.append(", ").append(country);
        sb.append(", ").append(postalCode);
        sb.append(", ").append(territory);

        sb.append(")");
        return sb.toString();
    }
}
