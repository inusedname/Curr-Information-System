package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;

import java.util.List;

public interface OrderDAO {
	public Long initOrder(String customer_id);
	public String addOrder(Order order);
	public String updateOrder(Order order);
	public String cancelOrder(int order_id);
	public List<Order> getListOrder(String customer_id);
	public Order getOrderInfo(int order_id);
	public List<Order> getAllOrder();
	public String updateOrderStatus(int order_id);
}
