package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.Milk;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Milk telunsuMilk = SimpleFactory.createMilkByName("telunsu");
        Milk mengniuMilk = SimpleFactory.createMilkByName("mengniu");
        if (null != telunsuMilk) {
            System.out.println(telunsuMilk.getName());
        }
        if (null != mengniuMilk) {
            System.out.println(mengniuMilk.getName());
        }

    }
}
