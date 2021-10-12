package com.learning.ecommerce.dto;

import com.learning.ecommerce.entity.Address;
import com.learning.ecommerce.entity.Customer;
import com.learning.ecommerce.entity.Order;
import com.learning.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
