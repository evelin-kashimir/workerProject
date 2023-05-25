package io.github.evelinferraz.hrpayroll.service;

import org.springframework.stereotype.Service;

import io.github.evelinferraz.hrpayroll.entity.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		Payment payment = new Payment("Bob", 200.0, days);
		return payment;
	}
}
