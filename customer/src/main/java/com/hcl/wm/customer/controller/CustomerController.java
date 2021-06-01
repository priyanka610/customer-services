package com.hcl.wm.customer.controller;

import com.hcl.wm.customer.dto.Customer;
import com.hcl.wm.customer.service.CustomerService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This represents the customer resource
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/{customerId}")
    Optional<Customer> getCustomer(@PathVariable ObjectId customerId) {
        return service.getCustomer(customerId);
    }


    @PostMapping("/addCustomer")
    void createCustomer(@RequestBody Customer customer) {
        service.saveCustomer(customer);
    }

    @GetMapping("/findAll")
    List<Customer> getCustomer() {
        return service.findAll();
    }
}
