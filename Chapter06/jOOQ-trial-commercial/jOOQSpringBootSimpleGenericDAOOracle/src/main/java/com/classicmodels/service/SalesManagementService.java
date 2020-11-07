package com.classicmodels.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.classicmodels.repository.OrderRepository;
import com.classicmodels.repository.SaleRepository;
import java.math.BigInteger;
import java.time.LocalDate;
import jooq.generated.tables.pojos.Sale;
import jooq.generated.tables.pojos.Order;

@Service
public class SalesManagementService {

    private final SaleRepository saleRepository;
    private final OrderRepository orderRepository;

    public SalesManagementService(
            OrderRepository orderRepository, SaleRepository saleRepository) {
        this.orderRepository = orderRepository;
        this.saleRepository = saleRepository;
    }

    /* call jOOQ user-defined DAO */
    public List<Order> fetchOrderDescByDate() {

        return orderRepository.findOrderDescByDate();
    }

    public List<Order> fetchOrderBetweenDate(LocalDate sd, LocalDate ed) {

        return orderRepository.findOrderBetweenDate(sd, ed);
    }

    public List<Sale> fetchSaleByFiscalYear(int year) {

        return saleRepository.findSaleByFiscalYear(year);
    }

    public List<Sale> fetchSaleAscGtLimit(int limit) {

        return saleRepository.findSaleAscGtLimit(limit);
    }

    /* call jOOQ user-defined generic DAO */
    public List<Order> fetchAllOrder() {

        return orderRepository.fetchAll();
    }

    public void deleteSaleById(BigInteger id) {

        saleRepository.deleteById(id);
    }
}
