package com.gupao.mode.strategy.v1;

public class Order {


    private String uId;

    private String orderId;

    private Double amount;


    public PayState pay(Payment payment) {
        return payment.pay(this.uId, this.amount);
    }

    public Order(String uId, String orderId, Double amount) {
        this.uId = uId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getuId() {

        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
