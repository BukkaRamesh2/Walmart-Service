package com.walmart.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Order;
import com.walmart.serviceImpl.OrderServiceImpl;


@RestController
@RequestMapping
public class OrderController {


    @PostMapping
    public String get(Order order)
    {
        String str; 
        OrderServiceImpl obj = new OrderServiceImpl();
        int discount = obj.getDiscount(order);
        double total = obj.calculateTotal(order);

        if(discount!=0)
            str = "Thanks for your Order, Your total bill is " + total
                 + "and you got a discount of " + discount 
                 + "percent so your final price is " + (total-discount) ;
        else
            str = "Thanks for your Order, Your total bill is" + total;

        return str;


    }




    
    
}
