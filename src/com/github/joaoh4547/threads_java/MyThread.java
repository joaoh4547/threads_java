package com.github.joaoh4547.threads_java;

import java.util.UUID;

public class MyThread extends Thread{
	private String name;
	private Integer time;
	private UUID id;
	
	public MyThread(String name,Integer time) {
		this.name = name;
		this.time = time;
		this.id = UUID.randomUUID(); 
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println(String.format("**********\nExecutando a Thread - [%s - %s]\n**********\n", this.name, this.id));
		
		for(int  i=0; i<=50;i++) {
			System.out.println(String.format("Thread [%s] - contador %d ",this.name, i));
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(String.format("\n*** Thread [%s - %s ] Finalizada ***\n",this.name,this.id ));
	}
}
