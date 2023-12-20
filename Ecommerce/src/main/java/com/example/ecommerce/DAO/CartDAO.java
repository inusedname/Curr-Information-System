package com.example.ecommerce.dao;

import com.example.ecommerce.model.Cart;

import java.util.List;

public interface CartDAO {
	public String addToCart(String product_id, int quantity, float price, String customer_id);
	public String updateQuantity(String product_id, int quantity, String customer_id);
	public String remove(String product_id, String customer_id, int quantity);
	public List<Cart> getCartInfo(String customer_id);
}
