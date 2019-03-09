package com.overcome.mode.strategy.v2;

/**
 * 减法算法
 */
public class SubAlgorithm implements Algorithm {
    @Override
    public int doOperation(int a, int b) {
        return a -b;
    }
}
