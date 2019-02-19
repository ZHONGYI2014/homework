package com.gupao.mode.factory.abstractFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new MengniuFactory();
        System.out.println(factory.getMengniu());
    }

}
