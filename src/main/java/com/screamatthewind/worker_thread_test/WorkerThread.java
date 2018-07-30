package com.screamatthewind.worker_thread_test;
public class WorkerThread implements Runnable {
  
    private Order order;
    
    public WorkerThread(Order newOrder){
        this.order = newOrder;
        System.out.println(order.getStatus() +  " Order #" + order.getOrderNo() + " WAITING");
    }

    public void run() {
        processCommand(order);
    }

    private void processCommand(Order order) {
        try {
        	// simulate delay to fulfill order
            System.out.println(order.getStatus() +  " Order #" + order.getOrderNo() + " PROCESSING");
            Thread.sleep(order.getOrderNo() * 1000);
            order.setStatus("FULFILLED");
            System.out.println(order.getStatus() +  " Order #" + order.getOrderNo() + " COMPLETED");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}