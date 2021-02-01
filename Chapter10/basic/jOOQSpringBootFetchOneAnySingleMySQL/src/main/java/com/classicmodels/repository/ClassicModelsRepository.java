package com.classicmodels.repository;

import static com.classicmodels.converter.YearMonthConverter.INTEGER_YEARMONTH_CONVERTER;
import java.time.YearMonth;
import java.util.Objects;
import java.util.Optional;
import static jooq.generated.tables.Customer.CUSTOMER;
import static jooq.generated.tables.Employee.EMPLOYEE;
import jooq.generated.tables.pojos.Employee;
import jooq.generated.tables.records.EmployeeRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    public void fetchOneEmployee() {

        EmployeeRecord result1 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne();

        System.out.println("Example 1.1.1\n" + result1);

        if (result1 != null) {
            System.out.println("Example 1.1.2\n"
                    + "Employee number: " + result1.value1() + " Email:" + result1.value5());
        }

        // this is not prone to NPE
        Employee result2 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(Employee.class);

        System.out.println("Example 1.2.1\n" + result2);

        if (result2 != null) {
            System.out.println("Example 1.2.2\n"
                    + "Employee number: " + result2.getEmployeeNumber() + " Email:" + result2.getEmail());
        }

        // pay attention, since this is prone to NPE if the specified employee number doesn't exist in the db
        Employee result3 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne().into(Employee.class);

        System.out.println("Example 1.3\n" + result3);

        var result4 = ctx.select(EMPLOYEE.EMAIL) // Record1<String>
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne();
        System.out.println("Example 1.4\n" + result4);

        // pay attention, since this is prone to NPE if the specified employee number doesn't exist in the db
        String result5 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne().value1(); // or, into(String.class)
        System.out.println("Example 1.5\n" + result5);

        String result6 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)                
                .fetchOneInto(String.class);
        System.out.println("Example 1.6\n" + result6);

        String result7 = Objects.requireNonNullElseGet(
                ctx.select(EMPLOYEE.EMAIL)
                        .from(EMPLOYEE)
                        .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(13700L)) // one or none (null)                
                        .fetchOneInto(String.class), () -> "-");
        System.out.println("Example 1.7\n" + result7);

        Optional<String> result8 = Optional.ofNullable(
                ctx.select(EMPLOYEE.EMAIL)
                        .from(EMPLOYEE)
                        .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)                
                        .fetchOneInto(String.class));
        System.out.println("Example 1.8\n" + result8);

        YearMonth result9 = ctx.select(CUSTOMER.FIRST_BUY_DATE)
                .from(CUSTOMER)
                .where(CUSTOMER.CUSTOMER_NUMBER.eq(112L)) // one or none (null)
                .fetchOne(CUSTOMER.FIRST_BUY_DATE, INTEGER_YEARMONTH_CONVERTER);
        System.out.println("Example 1.9\n" + result9);

        EmployeeRecord result10 = ctx.fetchOne(EMPLOYEE, EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L));
        System.out.println("Example 1.10 \n" + result10);

        Employee result11 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(Employee.class);
        System.out.println("Example 1.11\n" + result11);

        Employee result12 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(Employee.class);
        System.out.println("Example 1.12\n" + result12);

        EmployeeRecord result13 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(EmployeeRecord.class); // like ...fetchOne();
        System.out.println("Example 1.13\n" + result13);

        EmployeeRecord result14 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(EMPLOYEE);
        System.out.println("Example 1.14\n" + result14);

        EmployeeRecord result15 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOneInto(EMPLOYEE);
        System.out.println("Example 1.15\n" + result15);

        // Avoid fetching more data than needed
        String result16 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne(EMPLOYEE.EMAIL);
        System.out.println("Example 1.16 (avoid) \n" + result16);

        // Avoid fetching more data than needed
        String result17 = ctx.select(EMPLOYEE.FIRST_NAME, EMPLOYEE.JOB_TITLE, EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // one or none (null)
                .fetchOne(EMPLOYEE.EMAIL);
        System.out.println("Example 1.17 (avoid) \n" + result17);
    }

    public void fetchSingleEmployee() {

        EmployeeRecord result1 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingle();
        System.out.println("Example 2.1\n" + result1);

        var result2 = ctx.select(EMPLOYEE.EMAIL) // Record1<String>
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingle();
        System.out.println("Example 2.2\n" + result2);

        String result3 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingle().value1(); // or, into(String.class)
        System.out.println("Example 2.3\n" + result3);

        String result4 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingleInto(String.class);
        System.out.println("Example 2.4\n" + result4);

        YearMonth result5 = ctx.select(CUSTOMER.FIRST_BUY_DATE)
                .from(CUSTOMER)
                .where(CUSTOMER.CUSTOMER_NUMBER.eq(112L)) // must be exactly one
                .fetchSingle(CUSTOMER.FIRST_BUY_DATE, INTEGER_YEARMONTH_CONVERTER);
        System.out.println("Example 2.5\n" + result5);

        var result6 = ctx.fetchSingle(EMPLOYEE, EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)); // EmployeeRecord
        System.out.println("Example 2.6 \n" + result6);

        Employee result7 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingleInto(Employee.class);
        System.out.println("Example 2.7\n" + result7);

        Employee result8 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingleInto(Employee.class);
        System.out.println("Example 2.8\n" + result8);

        EmployeeRecord result9 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingleInto(EmployeeRecord.class); // like ...fetchSingle();
        System.out.println("Example 2.9\n" + result9);

        EmployeeRecord result10 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingleInto(EMPLOYEE);
        System.out.println("Example 2.10\n" + result10);

        // Avoid
        String result11 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingle(EMPLOYEE.EMAIL);
        System.out.println("Example 2.11 (avoid) \n" + result11);

        // Avoid
        String result12 = ctx.select(EMPLOYEE.FIRST_NAME, EMPLOYEE.JOB_TITLE, EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L)) // must be exactly one
                .fetchSingle(EMPLOYEE.EMAIL);
        System.out.println("Example 2.12 (avoid) \n" + result12);
    }

    public void fetchAnyEmployee() {

        EmployeeRecord result1 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_OF_YEAR.isNotNull())
                .fetchAny();
        System.out.println("Example 3.1.1\n" + result1);

        if (result1 != null) {
            System.out.println("Example 3.1.2\n"
                    + "Employee number: " + result1.value1() + " Email:" + result1.value5());
        }

        var result2 = ctx.select(EMPLOYEE.EMAIL) // Record1<String>
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_OF_YEAR.isNotNull())
                .fetchAny();
        System.out.println("Example 3.2\n" + result2);

        // pay attention, since this is prone to NPE if the specified employee number doesn't exist in the db
        String result3 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(1370L))
                .fetchAny().value1(); // or, into(String.class)
        System.out.println("Example 3.3\n" + result3);

        String result4 = ctx.select(EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAnyInto(String.class);
        System.out.println("Example 3.4\n" + result4);

        YearMonth result5 = ctx.select(CUSTOMER.FIRST_BUY_DATE)
                .from(CUSTOMER)
                .where(CUSTOMER.CUSTOMER_NUMBER.eq(112L))
                .fetchAny(CUSTOMER.FIRST_BUY_DATE, INTEGER_YEARMONTH_CONVERTER);
        System.out.println("Example 3.5\n" + result5);

        var result6 = ctx.fetchAny(EMPLOYEE, EMPLOYEE.EMPLOYEE_OF_YEAR.isNotNull()); // EmployeeRecord
        System.out.println("Example 3.6\n" + result6);

        Employee result7 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.SALARY.between(80000, 100000))
                .fetchAnyInto(Employee.class);
        System.out.println("Example 3.7\n" + result7);

        Employee result8 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAnyInto(Employee.class);
        System.out.println("Example 3.8\n" + result8);

        EmployeeRecord result9 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAnyInto(EmployeeRecord.class); // like ...fetchAny();
        System.out.println("Example 3.9\n" + result9);

        EmployeeRecord result10 = ctx.select(EMPLOYEE.EMAIL, EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAnyInto(EMPLOYEE);
        System.out.println("Example 3.10\n" + result10);

        // Avoid
        String result11 = ctx.selectFrom(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAny(EMPLOYEE.EMAIL);
        System.out.println("Example 3.11 (avoid) \n" + result11);

        // Avoid
        String result12 = ctx.select(EMPLOYEE.FIRST_NAME, EMPLOYEE.JOB_TITLE, EMPLOYEE.EMAIL)
                .from(EMPLOYEE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.in(1370L, 1504L, 1611L))
                .fetchAny(EMPLOYEE.EMAIL);
        System.out.println("Example 3.12 (avoid) \n" + result12);
    }
}
