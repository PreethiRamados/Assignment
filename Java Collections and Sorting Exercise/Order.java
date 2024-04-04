package javaCollectionsAndSortingExercise;

import java.time.LocalDate;


public class Order {
	private long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private long custId;
	
	public long getId() {
		return id;
	}
	public Order(long id, LocalDate orderDate, LocalDate deliveryDate, String status, long custId) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.custId = custId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public long getCustId() {
		return custId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ ", custId=" + custId + "]";
	}
	
	
	

}
