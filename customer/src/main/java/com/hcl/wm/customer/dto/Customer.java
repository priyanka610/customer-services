package com.hcl.wm.customer.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


/**
 * This represents the customer details
 */
@Component
@Document(collection = "customer")
@Getter
@Setter
@ToString
public class Customer {
    @Id
    private ObjectId cust_Id;
    private String firstName;
    private String lastName;
    private String address;
}

