package com.gupao.mode.proxy;


import com.overcome.mode.proxy.Human;
import com.overcome.mode.proxy.ITHuman;
import com.overcome.mode.proxy.NBDynamicProxy;
import org.junit.Test;

import java.io.IOException;

public class NBProxyTest {


    @Test
    public void testGenerateSrc() throws IOException {

        NBDynamicProxy proxy = new NBDynamicProxy(new ITHuman());
        Human human = (Human) proxy.getNBProxyInstace();
        human.eat();
    }
}