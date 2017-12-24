package com.leetutu.thread.study;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    private static final Integer NUM=3;
    private static CountDownLatch count=new CountDownLatch(CountDownLatchTest.NUM);

    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            public void run() {
                System.out.println("第一个任务执行完成。。。。");
                count.countDown();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            public void run() {
                System.out.println("第二个任务执行完成。。。。");
                count.countDown();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            public void run() {
                System.out.println("第三个任务执行完成。。。。");
                count.countDown();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            count.await();
            System.out.println("主线程执行完成。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
