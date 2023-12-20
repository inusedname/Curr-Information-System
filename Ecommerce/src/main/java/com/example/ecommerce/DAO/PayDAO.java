package com.example.ecommerce.dao;


import com.example.ecommerce.model.Payment;

public interface PayDAO {
	public int addPayment(Payment payment);
	public Payment getPaymentInfo(int payment_id);
	public String updatePaymentStatus(int pay_id, String status);
}
