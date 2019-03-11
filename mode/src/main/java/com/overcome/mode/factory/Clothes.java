package com.overcome.mode.factory;

/**
 * 李宁、nike、安踏和衣服构成一个产品等级
 * 抽象类是衣服, 子类是各个品牌的衣服
 */
public interface Clothes {

    String brand();

    String style();
}
