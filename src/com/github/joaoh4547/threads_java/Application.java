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
		
		new MyRunnable("Runnable #1", 1500);
		new MyRunnable("Runnable #2", 2500);
		new MyRunnable("Runnable #3", 550);
		new MyRunnable("Runnable #4", 2700);
		new MyRunnable("Runnable #5", 300);
		new MyRunnable("Runnable #6", 1200);
		new MyRunnable("Runnable #7", 900);
	}
	
	

}
