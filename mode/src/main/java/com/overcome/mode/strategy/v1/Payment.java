package com.overcome.mode.strategy.v1;

public interface Payment {


    final Payment ALI_PAY = new AliPay();

    PayState pay(String uid, Double amount);

}
