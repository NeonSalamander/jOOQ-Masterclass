/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Office;
import jooq.generated.tables.pojos.JooqOffice;
import jooq.generated.tables.records.OfficeRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class OfficeRepository extends DAOImpl<OfficeRecord, JooqOffice, String> {

    /**
     * Create a new OfficeRepository without any configuration
     */
    public OfficeRepository() {
        super(Office.OFFICE, JooqOffice.class);
    }

    /**
     * Create a new OfficeRepository with an attached configuration
     */
    @Autowired
    public OfficeRepository(Configuration configuration) {
        super(Office.OFFICE, JooqOffice.class, configuration);
    }

    @Override
    public String getId(JooqOffice object) {
        return object.getOfficeCode();
    }

    /**
     * Fetch records that have <code>office_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfOfficeCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.OFFICE_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>office_code IN (values)</code>
     */
    public List<JooqOffice> fetchByOfficeCode(String... values) {
        return fetch(Office.OFFICE.OFFICE_CODE, values);
    }

    /**
     * Fetch a unique record that has <code>office_code = value</code>
     */
    public JooqOffice fetchOneByOfficeCode(String value) {
        return fetchOne(Office.OFFICE.OFFICE_CODE, value);
    }

    /**
     * Fetch records that have <code>city BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.CITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city IN (values)</code>
     */
    public List<JooqOffice> fetchByCity(String... values) {
        return fetch(Office.OFFICE.CITY, values);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<JooqOffice> fetchByPhone(String... values) {
        return fetch(Office.OFFICE.PHONE, values);
    }

    /**
     * Fetch records that have <code>address_line_first BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfAddressLineFirst(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.ADDRESS_LINE_FIRST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_line_first IN (values)</code>
     */
    public List<JooqOffice> fetchByAddressLineFirst(String... values) {
        return fetch(Office.OFFICE.ADDRESS_LINE_FIRST, values);
    }

    /**
     * Fetch records that have <code>address_line_second BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfAddressLineSecond(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.ADDRESS_LINE_SECOND, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_line_second IN (values)</code>
     */
    public List<JooqOffice> fetchByAddressLineSecond(String... values) {
        return fetch(Office.OFFICE.ADDRESS_LINE_SECOND, values);
    }

    /**
     * Fetch records that have <code>state BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfState(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.STATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<JooqOffice> fetchByState(String... values) {
        return fetch(Office.OFFICE.STATE, values);
    }

    /**
     * Fetch records that have <code>country BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfCountry(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.COUNTRY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>country IN (values)</code>
     */
    public List<JooqOffice> fetchByCountry(String... values) {
        return fetch(Office.OFFICE.COUNTRY, values);
    }

    /**
     * Fetch records that have <code>postal_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfPostalCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.POSTAL_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>postal_code IN (values)</code>
     */
    public List<JooqOffice> fetchByPostalCode(String... values) {
        return fetch(Office.OFFICE.POSTAL_CODE, values);
    }

    /**
     * Fetch records that have <code>territory BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOffice> fetchRangeOfTerritory(String lowerInclusive, String upperInclusive) {
        return fetchRange(Office.OFFICE.TERRITORY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>territory IN (values)</code>
     */
    public List<JooqOffice> fetchByTerritory(String... values) {
        return fetch(Office.OFFICE.TERRITORY, values);
    }
}
