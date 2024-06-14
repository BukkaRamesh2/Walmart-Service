package com.walmart.model;
import java.util.Date;
import java.util.List;

public class Order {
    private long orderId; //
    private Long customerId;
    private String name;
    private String status;
    private List<Product> list;
    private Date date; 

    

    public long getId() {
        return orderId;
    }

    
    public void setId(long orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

}
