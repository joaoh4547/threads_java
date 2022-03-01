package com.github.joaoh4547.threads_java;

public class MyThread extends Thread{
	private String name;
	private Integer time;
	
	public MyThread(String name,Integer time) {
		this.name = name;
		this.time = time;
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println(String.format("Executando athread; %s", this.name));
		
		for(int  i=0; i<=10;i++) {
			System.out.println(String.format("Thread %s - contador %d ",this.name, i));
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(String.format("\n*** Thread [%s] finalizada ***\n",this.name ));
	}
}
