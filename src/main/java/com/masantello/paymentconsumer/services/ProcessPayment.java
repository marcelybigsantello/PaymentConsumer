package com.masantello.paymentconsumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.masantello.paymentconsumer.models.Payment;

@Service
public class ProcessPayment {
	
	private static final Logger log = LoggerFactory.getLogger(ProcessPayment.class);

	public void process(Payment payment) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
		try {
			log.info("Payment=" + mapper.writeValueAsString(payment));
		} catch (JsonProcessingException e) {
			log.error("Error when trying to process Json: " + e.getMessage());
		}
	}
}
