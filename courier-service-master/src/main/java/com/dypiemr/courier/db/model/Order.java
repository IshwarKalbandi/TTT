package com.dypiemr.courier.db.model;

import lombok.Data;

import java.time.Instant;

@Data
public class Order {
   
    private Long id;
   
    private Long addressId;
   
    private String address;
   
    private Long customerId;
    
    private String customerName;
    
    private Instant deliveryTime;
    
    private Long courierId;
   
    private OrderStatus state;
}
