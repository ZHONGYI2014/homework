package com.gupao.mode.proxy;
;
public class DynamicProxyTest {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new ITHuman());
        Human human = (Human) proxy.getProxyInstance();
        /** com.sun.proxy.$Proxy0 */
        //以$开头的类都是动态生成的
        System.out.println(human.getClass());
        human.work("coco");
    }
}
