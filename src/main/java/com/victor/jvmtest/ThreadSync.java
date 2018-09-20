package com.victor.jvmtest;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSync {
    public static void main(String[] args) {
        Job job = new Job();
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(() -> {
            Executors.newScheduledThreadPool(1).scheduleAtFixedRate(job::run, 0, 5000, TimeUnit.MILLISECONDS);
        });
        service.submit(() -> {
            Executors.newScheduledThreadPool(1).scheduleAtFixedRate(job::update, 0, 10000, TimeUnit.MILLISECONDS);
        });
    }

}


class Job {
    private volatile int i = 0;

    public void run() {
        if (i == 2) {
            System.out.println("skip");
        } else {
            i = 1;
            System.out.println("run");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (Exception e) {

            }
            System.out.println("run done");
            i = 0;
        }
    }

    public void update() {
        while (i != 0) {
//            System.out.println("waiting updating");
        }
        i = 2;
        System.out.println("begin update");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (Exception e) {

        }
        System.out.println("update done");
        i = 0;
    }

}