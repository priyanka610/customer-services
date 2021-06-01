package com.hcl.wm.driver.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This represents order of multiple items along with customer and driver details
 */
@Document
@Getter
@Setter
@ToString
public class Order {

    private String id;
    private Item item;
    private int qty;
    private Customer customer;
    private Driver driver;
    private String invoice;
    private String orderStatus;
}
