package com.github.joaoh4547.threads_java;

import java.util.UUID;

public class MyRunnable implements Runnable{
	
	private String name;
	private Integer time;
	private UUID id;
	
	public MyRunnable(String name, Integer time) {
		this.name = name;
		this.time = time;
		this.id = UUID.randomUUID();
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		System.out.println(String.format("**********\nExecutando a Thread - [%s - %s]\n**********\n", this.name, this.id));
		
		try {
			
			for(int i =0;i<=50;i++) {
				System.out.println(String.format("Thread [%s] - contador %d ",this.name, i));
				Thread.sleep(this.time);
			}
			System.out.println(String.format("\n*** Thread [%s - %s ] Finalizada ***\n",this.name,this.id ));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
