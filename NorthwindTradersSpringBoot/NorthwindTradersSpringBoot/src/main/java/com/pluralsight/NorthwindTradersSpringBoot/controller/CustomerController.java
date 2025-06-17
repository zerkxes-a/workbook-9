package com.pluralsight.NorthwindTradersSpringBoot.controller;

import com.pluralsight.NorthwindTradersSpringBoot.model.Customer;
import com.pluralsight.NorthwindTradersSpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(path="/customers", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(path="/customer", method = RequestMethod.GET)
    public Customer index(@RequestParam(defaultValue="1") String id) {
        return customerService.getCustomerById(id);
    }


}