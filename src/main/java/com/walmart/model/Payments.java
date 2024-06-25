

package com.walmart.model;

//
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @Column(name = "customerId")
    private Long customerId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "paymentDate")
    private Date paymentDate;

    @Column(name = "paymentMethod")
    private String paymentMethod;

    @Column(name = "status")
    private String status;

    public Payments() {
    }

    public Payments(Long customerId, Double amount, Date paymentDate, String paymentMethod, String status) {
        this.customerId = customerId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    // Getters and Setterss
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void message() {
        System.out.println("This message is from Payments class");
    }
}

