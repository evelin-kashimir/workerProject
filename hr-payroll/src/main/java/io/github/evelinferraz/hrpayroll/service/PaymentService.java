package io.github.evelinferraz.hrpayroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.evelinferraz.hrpayroll.entity.Payment;
import io.github.evelinferraz.hrpayroll.entity.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerrHost;
	
	@Autowired
	private RestTemplate template;
	
	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", workerId.toString());
				
		Worker worker = template.getForObject(
				workerrHost + "workers/{id}", Worker.class, uriVariables
			);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
