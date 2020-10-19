/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.math.BigInteger;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Employee;
import jooq.generated.tables.pojos.JooqEmployee;
import jooq.generated.tables.records.EmployeeRecord;

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
        "jOOQ version:3.13.5",
        "schema version:1.1"
    },
    date = "2020-10-19T14:04:39.558Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class EmployeeRepository extends DAOImpl<EmployeeRecord, JooqEmployee, Long> {

    /**
     * Create a new EmployeeRepository without any configuration
     */
    public EmployeeRepository() {
        super(Employee.EMPLOYEE, JooqEmployee.class);
    }

    /**
     * Create a new EmployeeRepository with an attached configuration
     */
    @Autowired
    public EmployeeRepository(Configuration configuration) {
        super(Employee.EMPLOYEE, JooqEmployee.class, configuration);
    }

    @Override
    public Long getId(JooqEmployee object) {
        return object.getEmployeeNumber();
    }

    /**
     * Fetch records that have <code>EMPLOYEE_NUMBER BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfEmployeeNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.EMPLOYEE_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>EMPLOYEE_NUMBER IN (values)</code>
     */
    public List<JooqEmployee> fetchByEmployeeNumber(Long... values) {
        return fetch(Employee.EMPLOYEE.EMPLOYEE_NUMBER, values);
    }

    /**
     * Fetch a unique record that has <code>EMPLOYEE_NUMBER = value</code>
     */
    public JooqEmployee fetchOneByEmployeeNumber(Long value) {
        return fetchOne(Employee.EMPLOYEE.EMPLOYEE_NUMBER, value);
    }

    /**
     * Fetch records that have <code>LAST_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LAST_NAME IN (values)</code>
     */
    public List<JooqEmployee> fetchByLastName(String... values) {
        return fetch(Employee.EMPLOYEE.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>FIRST_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>FIRST_NAME IN (values)</code>
     */
    public List<JooqEmployee> fetchByFirstName(String... values) {
        return fetch(Employee.EMPLOYEE.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>EXTENSION BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfExtension(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.EXTENSION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>EXTENSION IN (values)</code>
     */
    public List<JooqEmployee> fetchByExtension(String... values) {
        return fetch(Employee.EMPLOYEE.EXTENSION, values);
    }

    /**
     * Fetch records that have <code>EMAIL BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<JooqEmployee> fetchByEmail(String... values) {
        return fetch(Employee.EMPLOYEE.EMAIL, values);
    }

    /**
     * Fetch records that have <code>OFFICE_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfOfficeCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.OFFICE_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>OFFICE_CODE IN (values)</code>
     */
    public List<JooqEmployee> fetchByOfficeCode(String... values) {
        return fetch(Employee.EMPLOYEE.OFFICE_CODE, values);
    }

    /**
     * Fetch records that have <code>SALARY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfSalary(BigInteger lowerInclusive, BigInteger upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.SALARY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>SALARY IN (values)</code>
     */
    public List<JooqEmployee> fetchBySalary(BigInteger... values) {
        return fetch(Employee.EMPLOYEE.SALARY, values);
    }

    /**
     * Fetch records that have <code>REPORTS_TO BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfReportsTo(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.REPORTS_TO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>REPORTS_TO IN (values)</code>
     */
    public List<JooqEmployee> fetchByReportsTo(Long... values) {
        return fetch(Employee.EMPLOYEE.REPORTS_TO, values);
    }

    /**
     * Fetch records that have <code>JOB_TITLE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqEmployee> fetchRangeOfJobTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Employee.EMPLOYEE.JOB_TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>JOB_TITLE IN (values)</code>
     */
    public List<JooqEmployee> fetchByJobTitle(String... values) {
        return fetch(Employee.EMPLOYEE.JOB_TITLE, values);
    }
}
