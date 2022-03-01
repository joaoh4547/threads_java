package com.github.joaoh4547.threads_java;

public class Application {

	public static void main(String[] args) {
		
		// With thread 
//		new MyThread("Thread #1",2000);
//		new MyThread("Thread #2",1200);
//		new MyThread("Thread #3",500);
//		new MyThread("Thread #4",700);
//		new MyThread("Thread #5",900);
		
		
		// With runnable
		
		runThread(new MyRunnable("Runnable #1", 1500),Thread.MAX_PRIORITY);
		runThread(new MyRunnable("Runnable #2", 2500),Thread.MAX_PRIORITY);
		runThread(new MyRunnable("Runnable #3", 550),Thread.MIN_PRIORITY);
		runThread(new MyRunnable("Runnable #4", 2700),Thread.MIN_PRIORITY);
		runThread(new MyRunnable("Runnable #5", 300),Thread.MAX_PRIORITY);
		runThread(new MyRunnable("Runnable #6", 1200),Thread.NORM_PRIORITY);
		runThread(new MyRunnable("Runnable #7", 900),Thread.NORM_PRIORITY);
	}
	
	private static Thread runThread(Runnable runnable,int priotity) {
		Thread t = new Thread(runnable);
		t.start();
		t.setPriority(priotity);
		return t;
	}
	
	

}
