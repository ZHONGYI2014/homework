package com.gupao.mode.factory.simpleFactory;

import com.gupao.mode.factory.MengNiu;
import com.gupao.mode.factory.Milk;
import com.gupao.mode.factory.Telunsu;

/**
 * 简单工厂模式
 * 弊端：当需要生产N种以上的牛奶，并且牛奶成分比例不同，产生牛奶更加复杂
 * 改进：使用抽象工厂模式，不需要通过名字来获取，并且为每种牛奶构建工厂
 */
public class SimpleFactory {

    /**
     * 用户需要通过名字来获取牛奶
     * @param milkName
     * @return
     */
    public static Milk createMilkByName(String milkName) {
        if ("telunsu".equals(milkName)) {
            return new Telunsu();
        }
        if ("mengniu".equals(milkName)) {
            return new MengNiu();
        }
        return null;
    }

}
