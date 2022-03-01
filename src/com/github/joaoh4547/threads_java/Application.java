package com.github.joaoh4547.threads_java;

public class Application {

	public static void main(String[] args) {
	
		new MyThread("Thread #1",2000);
		new MyThread("Thread #2",1200);
		new MyThread("Thread #3",500);
		
	}

}
