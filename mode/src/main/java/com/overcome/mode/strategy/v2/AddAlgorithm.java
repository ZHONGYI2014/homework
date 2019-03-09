package com.overcome.mode.strategy.v2;

/**
 * 加法算法
 */
public class AddAlgorithm implements Algorithm {

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
