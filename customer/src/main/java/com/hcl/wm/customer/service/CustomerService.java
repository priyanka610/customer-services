package com.hcl.wm.customer.service;

import com.hcl.wm.customer.dto.Customer;
import com.hcl.wm.customer.repository.CustomerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * This represents the customer service
 */
@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public Optional<Customer> getCustomer(ObjectId customerId) {

        return repository.findById(customerId);
    }

    public void saveCustomer(Customer customer) {
        repository.save(customer);
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }
}
