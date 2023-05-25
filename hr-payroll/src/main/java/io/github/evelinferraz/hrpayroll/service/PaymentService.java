package io.github.evelinferraz.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.evelinferraz.hrpayroll.entity.Payment;
import io.github.evelinferraz.hrpayroll.entity.Worker;
import io.github.evelinferraz.hrpayroll.feign.clients.WorkerFeignClient;


@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {			
		Worker worker = workerFeignClient.findById(workerId).getBody();		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
