package com.walmart.model;
import java.util.Date;
import java.util.List;

public class Order {
    private long id; //
    private String name;
    private String status;
    private List<String> list;
    private Date date; 

    

    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
