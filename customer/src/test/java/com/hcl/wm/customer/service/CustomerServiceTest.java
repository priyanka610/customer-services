package com.hcl.wm.customer.service;

import com.hcl.wm.customer.dto.Customer;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static com.mongodb.assertions.Assertions.assertNull;

class CustomerServiceTest {

    @Autowired
    private CustomerService service=new CustomerService();

    @Test
    void getCustomer() {
       // Optional<Customer> customer = service.getCustomer(new ObjectId("60af80fcdd50ed5e94cff244"));
        //assertNull(customer);
    }

    @Test
    void saveCustomer() {
        //TODO: need to implement
    }

    @Test
    void findAll() {
        //TODO:need to implement
    }
}