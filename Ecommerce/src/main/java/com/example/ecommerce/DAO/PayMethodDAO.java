package com.example.ecommerce.dao;

import com.example.ecommerce.model.PayMethod;

import java.util.List;


public interface PayMethodDAO {
	public List<PayMethod> getPayMethod();
	public float getOfferById(int id);
}
