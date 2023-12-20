package com.example.ecommerce.dao;

import com.example.ecommerce.model.ShipMethod;

import java.util.List;


public interface ShipMethodDAO {
	public List<ShipMethod> getShipMethod();
	public float getPriceById(int id);
}
