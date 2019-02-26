package com.gupao.mode.proxy;

public class ITHuman implements Human {

    public void eat() {
        System.out.println("eat cookie、vegetable");
    }

    public void work(String name) {
        System.out.println(name + " design software for human life");
    }
}
