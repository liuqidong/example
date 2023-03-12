package com.lagou.concurrent.demo;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " 线程运行起来了");
    }
}
