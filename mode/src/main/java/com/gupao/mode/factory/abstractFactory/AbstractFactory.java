package com.gupao.mode.factory.abstractFactory;

import com.gupao.mode.factory.Milk;

/**
 * 抽象工厂
 * 开闭原则
 */
public abstract class AbstractFactory {

    public abstract Milk getMengniu();

    public abstract Milk getTelunsu();

}
