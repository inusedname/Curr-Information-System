package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	private int order_id;
	private String customer_id;
	private String order_date;
	private String order_status;
	private float total_price;
	private int discount_id;
	private int cart_id;
	private int pay_id;
	private int ship_id;
	
	public Order() {}

	public Order(int order_id, String customer_id, String order_date, String order_status, float total_price,
			int discount_id, int cart_id, int ship_id, int pay_id) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.order_date = order_date;
		this.order_status = order_status;
		this.total_price = total_price;
		this.discount_id = discount_id;
		this.cart_id = cart_id;
		this.pay_id = pay_id;
		this.ship_id = ship_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public float getTotal_price() {
		return total_price;
	}

	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}

	public int getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(int discount_id) {
		this.discount_id = discount_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getPay_id() {
		return pay_id;
	}

	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}

	public int getShip_id() {
		return ship_id;
	}

	public void setShip_id(int ship_id) {
		this.ship_id = ship_id;
	}
}
