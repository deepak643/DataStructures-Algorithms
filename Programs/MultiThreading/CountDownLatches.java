package com.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Latches implements Runnable{
	private CountDownLatch latch;
	public Latches(CountDownLatch latch){
		this.latch = latch;
	}
	public void run(){
		System.out.println("Started...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("processing..." + System.currentTimeMillis());
		latch.countDown();
	}
}

public class CountDownLatches {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0; i<3; i++){
			executor.submit(new Latches(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Completed in :" + (end - start));
	}
}
