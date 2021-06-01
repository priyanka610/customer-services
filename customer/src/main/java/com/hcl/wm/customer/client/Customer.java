package com.hcl.wm.driver.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String cust_Id;
    private String firstName;
    private String lastName;
    private String address;
}
