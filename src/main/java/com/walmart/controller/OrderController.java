package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Customer;
import com.walmart.model.Order;
import com.walmart.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @PostMapping("/save")
    public ResponseEntity<String> saveOrder(@RequestBody Order order){
	   return new ResponseEntity<String>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @GetMapping("/getOrderById/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") Long orderId){
	   return new ResponseEntity<Order>(orderService.getOrderById(orderId), HttpStatus.OK);

    }

    @GetMapping("/getCustomerById/{orderId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long orderId){
	   return new ResponseEntity<Customer>(orderService.getCustomerById(orderId), HttpStatus.OK);

    }

    @GetMapping("/getAllOrders")
    public List<Order> getOrdersList(){
	   return orderService.getAllOrders();
    }

    @GetMapping("/total")
    public String getTotal(@RequestBody Order order)
    {
        String str; 
        int discount = orderService.getDiscount(order);
        double total = orderService.calculateTotal(order);
        
        double finalCost = (100-discount)*total/100;
        if(discount!=0)
            str = "Thanks for your Order, Your total bill is " + total
                 + "and you got a discount of " + discount 
                 + "percent so your final price is " + finalCost ;
        else
            str = "Thanks for your Order, Your total bill is" + total;

        return str;
    }

    @GetMapping("/total/{orderId}")
    public String getTotalById(@PathVariable Long orderId)
    { 
        Order order = orderService.getOrderById(orderId);
        return getTotal(order);
    }
}