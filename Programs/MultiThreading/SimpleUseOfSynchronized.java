package com.threads;

public class SimpleUseOfSynchronized {
	private int count = 0;
	
	public synchronized void increment(){
		count++;	//Atomic operation. count=count+1;
	}
	
	public static void main(String[] args) {
		SimpleUseOfSynchronized process = new SimpleUseOfSynchronized();
		process.doWork();
	}
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0; i<1000; i++){
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0; i<1000; i++){
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: "+ count);
	}

}
