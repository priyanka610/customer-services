package com.hcl.wm.driver.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
public class Driver {
    private String driver_id;
    private String pickedUpStatus;
    private String deliveredStatus;
}
