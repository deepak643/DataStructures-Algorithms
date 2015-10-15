package com.threads;

import java.util.Scanner;

class Processor implements Runnable{
	private volatile boolean running = true;
	@Override
	public void run() {
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
}


public class BasicThreadSynchronization_COP {
	public static void main(String[] args) {
		Processor proc = new Processor();
		Thread t = new Thread(proc);
		t.start();
		
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		proc.shutdown();
		
	}
}
