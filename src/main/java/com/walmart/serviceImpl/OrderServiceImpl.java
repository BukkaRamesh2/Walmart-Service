package com.walmart.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.walmart.exception.OrderAlreadyExistException;
import com.walmart.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.model.Customer;
import com.walmart.model.Order;
import com.walmart.model.Product;
import com.walmart.repository.OrderRepository;
import com.walmart.repository.ProductRepository;
import com.walmart.service.CustomerService;
import com.walmart.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
	OrderRepository orderRepo;

    @Autowired
  	ProductRepository productRepo;
    
    @Autowired
    CustomerService custService;

    @Override
    public double calculateTotal(Order order)
    {
        double total = 0;
        List<Product> list = productRepo.findAll();
        for(int i=0;i<list.size();i++)
        {
            total += list.get(i).getPrice();
        }
        return total;
    }

    @Override
    public int getDiscount(Order order) {

        double total = calculateTotal(order);

        if(total<100)
            return 0;
        else if(total<200)
            return 2;
        else if(total<300)
            return 3;
        else 
            return 5;
    }

    @Override
    public String saveOrder(Order order) {
        Optional<Order> ExistingOrder =  orderRepo.findById(order.getId());
        if(ExistingOrder.isPresent()){
            throw new OrderAlreadyExistException("Order with thr given ID is already present " + order.getId());
        }else {
            orderRepo.save(order);
            return "Order Saved Successfully";
        }


    }

    @Override
    public Customer getCustomerById(Long orderId) {

        Order order = getOrderById(orderId);
        Long customerId = order.getCustomerId();
        return custService.getCustomerById(customerId);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        Optional<Order> order =  orderRepo.findById(orderId);
	        if(order.isPresent()){
	            return order.get();
	        }else {
	            throw new OrderNotFoundException("There is no order with the ID" + orderId);
	        }
    }

    
}
