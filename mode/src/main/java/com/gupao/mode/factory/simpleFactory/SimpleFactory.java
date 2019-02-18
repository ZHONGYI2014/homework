package com.gupao.mode.factory.simpleFactory;

import com.gupao.mode.factory.MengNiu;
import com.gupao.mode.factory.Milk;
import com.gupao.mode.factory.Telunsu;

public class SimpleFactory {

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
