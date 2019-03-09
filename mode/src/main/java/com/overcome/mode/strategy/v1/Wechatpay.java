package com.overcome.mode.strategy.v1;

public class Wechatpay implements Payment {

    @Override
    public PayState pay(String uid, Double amount) {
        System.out.println("欢迎使用微信支付");
        return new PayState(200, "支付成功", amount);
    }
}
