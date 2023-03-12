package com.lagou.concurrent.demo;

public class Main {
    public static void main(String[] args) {
//        new MyThread().start();
        System.out.println(Thread.currentThread().getName());

        new Thread(new MyRunnable()).start();

    }
}
