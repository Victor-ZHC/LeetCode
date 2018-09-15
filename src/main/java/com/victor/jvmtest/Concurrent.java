package com.victor.jvmtest;

import java.util.concurrent.*;

public class Concurrent {
    volatile int i = 0;

    void incress() {
        i++;
    }

    public static void main(String[] args) throws Exception {
        Concurrent c = new Concurrent();
        ExecutorService service = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++) {
            service.submit(c::incress);
            System.out.println(((ThreadPoolExecutor) service).getActiveCount());
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(c.i);

    }

}
