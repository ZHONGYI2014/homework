package com.overcome.mode.factory.abstractFactory;

import com.overcome.mode.factory.Clothes;
import com.overcome.mode.factory.Shoes;

/**
 * 抽象工厂与工厂方法最大的区别就在于：
 * 工厂方法模式针对的是一个产品等级结构，而抽象工厂模式需要面对多个产品等级结构，
 * 一个工厂等级结构可以负责多个不同产品等级中的产品对象的创建。
 *
 * 产品族和产品等级概念：
 *      鞋子和衣服数组一个产品族；
 *      nike衣服和liNing衣服属于一个产品等级衣服是他们的一个抽象类
 */
public abstract class AbstractGoodsFactory {

    public abstract Clothes produceClothes();

    public abstract Shoes pruduceShoes();

}
