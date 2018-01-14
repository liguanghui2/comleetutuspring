package com.leetutu.thread.study;

/**
 * @author: Kevin.Lee
 * @create: 2018-01-14 11:54:46
 **/
public class ThreadLocalTest {
	public static void main(String[] args) {
		ThreadLocalTest threadLocalTest=new ThreadLocalTest();
		threadLocalTest.testThreadLocalTest();
	}

	private void testThreadLocalTest(){
		Thread thread1=new Thread(new Runnable() {
			ThreadLocal<String>  threadLocal=new ThreadLocal<String>();
			String str=null;
			public void run() {
				threadLocal.set("this is test infomation for ThreadLocalTest");
				str= threadLocal.get();
				System.out.println(str);
			}
		});
		thread1.start();

	}
}
