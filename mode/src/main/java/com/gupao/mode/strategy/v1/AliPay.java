package com.gupao.mode.strategy.v1;

public class AliPay implements Payment{

    @Override
    public PayState pay(String uid, Double amount) {
        System.out.println("欢迎使用支付宝支付");
        return new PayState(200, "支付成功", amount);
    }
}
