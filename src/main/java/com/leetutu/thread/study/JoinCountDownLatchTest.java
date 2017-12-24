package com.leetutu.thread.study;

public class JoinCountDownLatchTest {
    public static void main(String[] args) {
         Thread thread1=new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("任务1执行完成。。。。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
         Thread thread2=new Thread(new Runnable() {
             public void run() {
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("任务2执行完成。。。");
             }
         });
         thread1.start();
         thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("所有任务执行完成");
    }
}
