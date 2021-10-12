package com.learning.ecommerce.service;


import com.learning.ecommerce.dto.Purchase;
import com.learning.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
