package com.classicmodels;

import com.classicmodels.service.ClassicModelsService;
import java.time.LocalDate;
import java.util.List;
import jooq.generated.tables.pojos.Order;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.classicmodels", "jooq.generated.tables.daos"})
public class MainApplication {

    private final ClassicModelsService orderManagementService;

    public MainApplication(ClassicModelsService orderManagementService) {
        this.orderManagementService = orderManagementService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            System.out.println("Fetching shipped orders after 2005-01-01:");
            List<Order> result1 = orderManagementService.fetchOrderByStatusAndOrderDate(
                    "Shipped", LocalDate.of(2005, 1, 1));
            System.out.println(result1);

            System.out.println("Fetching 5 orders:");
            List<Order> result2 = orderManagementService.fetchLimitedTo(5);
            System.out.println(result2);
        };
    }
}
