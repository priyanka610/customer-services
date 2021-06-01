package com.hcl.wm.customer.repository;

import com.hcl.wm.customer.dto.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * This represents the customer repository
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {
}
