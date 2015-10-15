package com.threads;

import java.util.Scanner;


class WaitNotify{
	public void producer() throws InterruptedException{
		synchronized(this){
			System.out.println("Producer thread...");
			wait(); //can only be called synchronized block
			System.out.println("Resumed...");
		}
	}
	
	public void consumer() throws InterruptedException{
		Thread.sleep(1000); // the producer gets the chance to kick off first.
		Scanner input = new Scanner(System.in);
		synchronized(this){
			System.out.println("Waiting for notification...");
			input.nextLine();
			notify();
			System.out.println("Notified...");
		}
	}
}

public class WaitAndNotify {
	public static void main(String[] args) throws InterruptedException{
		final WaitNotify processor = new WaitNotify();
		
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
