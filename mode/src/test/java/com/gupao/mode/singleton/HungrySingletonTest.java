package com.gupao.mode.singleton;


import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class HungrySingletonTest {

    @Test
    public void testThreadSafe() {
        int count = 1000;

        final CountDownLatch latch = new CountDownLatch(count);
        System.out.println("----- begin ----");
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        Object obj = HungrySingleton.getInstance();
                        System.out.println(System.currentTimeMillis() + ": " + obj);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            // count --
            latch.countDown();
        }
    }



}