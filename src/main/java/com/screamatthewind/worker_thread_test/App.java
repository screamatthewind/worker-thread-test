package com.screamatthewind.worker_thread_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			Order order = new Order(i+1, "NEW");
			Runnable worker = new WorkerThread(order);
			executor.execute(worker);
		}
		
		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		
		System.out.println("All Orders have been Fulfilled");
	}
}
