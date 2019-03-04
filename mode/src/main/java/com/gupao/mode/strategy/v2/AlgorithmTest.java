package com.gupao.mode.strategy.v2;

public class AlgorithmTest {

    public static void main(String[] args) {
        Algorithm add = new AddAlgorithm();
        Algorithm sub = new SubAlgorithm();
        System.out.println("加法： " + add.doOperation(1,2));
        System.out.println("减法： " + sub.doOperation(10,4));
    }
}
