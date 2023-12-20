package com.example.ecommerce.dao;

import com.example.ecommerce.model.Product;

import java.util.List;

public interface ProductDAO {
	public Product getDetail(String product_id);
	public List<Product> getList();
	public List<Product> searchProduct(String search);
	public String addProduct(Product product);
}
