package com.leetutu.test;

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import static java.lang.Thread.*;

public class ConcurrentLinkedQueueTest {
    public static void main(String[] args) {
        final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();

         Thread thread1=new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <10000; i++) {
                    String uuid=UUID.randomUUID().toString();
                    queue.add(uuid);
                    System.out.println("线程1添加了一个元素："+uuid);
                }
            }
        });
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <10000; i++) {
                    if(queue.isEmpty()){
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(!queue.isEmpty()){
                        System.out.println("线程2取出队列中的元素："+queue.poll());
                    }
                }
            }
        });
        thread2.start();
    }
}
