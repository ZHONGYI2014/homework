package com.gupao.mode.proxy;


import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class DynamicProxyTest {

    @Test
    public void getDynamicProxyClass() throws IOException {
        //通过反编译工具查看源代码
        //$Proxy4 是已经在JVM中生成的动态代理类
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy4", new Class[]{Human.class});
        FileOutputStream outputStream = new FileOutputStream("//Users//pengy//$Proxy4s.class");
        outputStream.write(bytes);
        outputStream.close();
    }

    @Test
    public void proxy() throws IOException {
        DynamicProxy proxy = new DynamicProxy(new ITHuman());
        Human human = (Human) proxy.getProxyInstance();
        /** com.sun.proxy.$Proxy0 */
        //以$开头的类都是动态生成的
        System.out.println(human.getClass());
        human.work("coco");
    }

}
