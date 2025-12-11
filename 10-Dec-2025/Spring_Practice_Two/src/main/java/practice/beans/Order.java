package practice.beans;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	@Value("${Order.orderId}")
	private int orderId;

	@Value("#{T(java.time.LocalDate).parse('${Order.orderDate}')}")
	private LocalDate orderDate;

	@Value("${Order.orderCost}")
	private double orderCost;

	@Value("${Order.itemList}")
	private Set<String> itemList;
	
	private String orderType;
	private LocalDate deliveryDate;
	private double discount;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public Set<String> getItemList() {
		return itemList;
	}

	public void setItemList(Set<String> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderCost=" + orderCost + ", itemList="
				+ itemList + "]";
	}

	public Order(int orderId, LocalDate orderDate, double orderCost, Set<String> itemList) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderCost = orderCost;
		this.itemList = itemList;
	}

	public Order() {
		super();
	}

}
