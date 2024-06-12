package com.walmart.serviceImpl;

import java.util.List;

import com.walmart.model.Order;
import com.walmart.model.Product;
import com.walmart.service.OrderService;

public class OrderServiceImpl implements OrderService{



    @Override
    public double calculateTotal(Order order)
    {
        double total = 0;
        List<Product> list = order.getList();
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
}
