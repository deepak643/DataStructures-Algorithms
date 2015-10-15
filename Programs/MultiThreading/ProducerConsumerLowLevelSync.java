package com.threads;

import java.util.LinkedList;
import java.util.Random;

class LowLevelSync{
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int Limit = 10;
	private Object lock = new Object();
	
	public void producer() throws InterruptedException{
		System.out.println("Producer started...");
		int value = 0;
		while(true){
			synchronized(lock){
				while(list.size() == Limit){
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException{
		Random random = new Random();
		while(true){
			synchronized(lock){
				while(list.size() == 0){
					lock.wait();
				}
				System.out.print("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("; value is: "+ value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));
		}
	}
}

public class ProducerConsumerLowLevelSync {

	public static void main(String[] args) throws InterruptedException{
		final LowLevelSync processor = new LowLevelSync();
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
