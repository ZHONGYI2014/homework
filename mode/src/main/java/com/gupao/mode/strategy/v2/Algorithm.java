package com.gupao.mode.strategy.v2;

/**
 * 将 + -  基本算术抽象出一个算法
 * 总结：符合开闭原则原则，不修改原来的代码
 * 需要做新的算法的时候只要实现这个接口就行了
 * 不会对原有代码做修改
 */
public interface Algorithm {

    int doOperation(int a, int b);

}
