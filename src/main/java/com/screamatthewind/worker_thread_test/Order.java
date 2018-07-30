package com.screamatthewind.worker_thread_test;

public class Order {
	Integer orderNo;
	String status;
	
	public Order(Integer orderNo, String status) {
		super();
		this.orderNo = orderNo;
		this.status = status;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", status=" + status + "]";
	}
}

