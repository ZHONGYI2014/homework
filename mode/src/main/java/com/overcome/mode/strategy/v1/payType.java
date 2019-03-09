package com.overcome.mode.strategy.v1;

public enum payType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new Wechatpay())
    ;

    private Payment payment;

    payType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return this.payment;
    }
}
