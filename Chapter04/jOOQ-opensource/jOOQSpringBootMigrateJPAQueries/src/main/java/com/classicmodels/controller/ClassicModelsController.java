package com.classicmodels.controller;

import com.classicmodels.entity.Employee;
import com.classicmodels.pojo.EmployeeCntr;
import com.classicmodels.service.ClassicModelsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jooq.generated.tables.interfaces.IEmployee;
import jooq.generated.tables.pojos.JooqEmployee;
import com.classicmodels.pojo.EmployeeSlim;
import com.classicmodels.pojo.EmployeeLeastSalary;

@RestController
public class ClassicModelsController {

    private final ClassicModelsService classicModelsService;

    public ClassicModelsController(ClassicModelsService classicModelsService) {
        this.classicModelsService = classicModelsService;
    }

    @GetMapping("/totalsales")
    public List<Object[]> fetchEmployeesWithTotalSalesByFiscalYear() {

        return classicModelsService.fetchEmployeesWithTotalSalesByFiscalYear();
    }

    @GetMapping("/leastsalary")
    public List<EmployeeLeastSalary> fetchEmployeesAndLeastSalary() {

        return classicModelsService.fetchEmployeesAndLeastSalary();
    }

    @GetMapping("/leastsalarycntr")
    public List<EmployeeCntr> fetchEmployeesAndLeastSalaryCntr() {

        return classicModelsService.findEmployeesAndLeastSalaryCntr();
    }

    @GetMapping("/first5employee")
    public List<EmployeeSlim> fetchFirst5ByOrderBySalaryDesc() {

        return classicModelsService.fetchFirst5ByOrderBySalaryDesc();
    }

    @GetMapping("/inoffice")
    public List<Employee> fetchEmployeeInCity(@RequestParam String city) {

        return classicModelsService.fetchEmployeeInCity(city);
    }

    @GetMapping("/employeesalaryinrange")
    List<Employee> fetchEmployeeSalaryInRange(@RequestParam int start, @RequestParam int end) {

        return classicModelsService.fetchEmployeeSalaryInRange(start, end);
    }

    @GetMapping("/employeescntr")
    public List<JooqEmployee> fetchByJobTitleCntr(@RequestParam String jobTitle) {

        return classicModelsService.fetchByJobTitleCntr(jobTitle);
    }

    @GetMapping("/employeesinterfacejpql")
    public List<IEmployee> fetchByJobTitleJpql(@RequestParam String jobTitle) {

        return classicModelsService.fetchByJobTitleJpql(jobTitle);
    }

    @GetMapping("/employeesinterfacenative")
    public List<IEmployee> fetchByJobTitleNative(@RequestParam String jobTitle) {

        return classicModelsService.fetchByJobTitleNative(jobTitle);
    }
}
