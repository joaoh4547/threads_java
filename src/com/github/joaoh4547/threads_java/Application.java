package com.github.joaoh4547.threads_java;

public class Application {

	public static void main(String[] args) {
	
		new MyThread("thread #1",2000);
		new MyThread("thread #2",1200);
		new MyThread("thread #3",500);
		
	}

}
