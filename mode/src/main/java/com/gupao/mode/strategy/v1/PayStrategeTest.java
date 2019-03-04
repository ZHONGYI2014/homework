package com.gupao.mode.strategy.v1;

/**
 * 最终执行结果是固定的。
 * 执行过程和执行逻辑不一样。
 */
public class PayStrategeTest {

    public static void main(String[] args) {
        Order order = new Order("201820620227", "10086", 10000000000.00);

        // 开始支付，支付方式：微信、支付宝、银行卡、京东白条
        System.out.println(order.pay(new AliPay()));

        // 需要用switch

        System.out.println(order.pay(new Wechatpay()));

        System.out.println(order.pay(payType.WECHAT_PAY.getPayment()));
    }
}
