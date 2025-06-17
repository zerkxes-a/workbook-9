package com.pluralsight.NorthwindTradersSpringBoot.service;

import com.pluralsight.NorthwindTradersSpringBoot.dao.CustomerDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {


    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void addCustomer(Customer customer) {
        customerDAO.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.getAll();
    }

    public Customer getCustomerById(String id) {

        return customerDAO.getByCustomerID(id);
    }
}