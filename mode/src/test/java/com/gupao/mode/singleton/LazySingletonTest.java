package com.gupao.mode.singleton;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class LazySingletonTest {
    @Test
    public void threadSafeTest() throws InterruptedException {
        int count = 1000;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        Object obj = LazySingleton.getInstance();
                        System.out.println(System.currentTimeMillis()+" : " + obj);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("总耗时：" + (end - start));
    }

}
