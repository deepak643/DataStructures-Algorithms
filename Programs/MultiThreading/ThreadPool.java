package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class thread implements Runnable{
	private int id;
	
	public thread(int id){
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Starting: " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed: " + id);
	}
}

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i=0; i<5; i++){
			executor.submit(new thread(i));
		}
		
		executor.shutdown(); //saying do not accept any more tasks. Do not shutdown immediately and wait for the threads to complete what they are doing
		System.out.println("All tasks are submitted...");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasks are completed...");
	}
}
