package com.masantello.paymentconsumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.masantello.paymentconsumer.models.Payment;
import com.masantello.paymentconsumer.services.ProcessPayment;
import com.masantello.paymentconsumer.utils.Formatter;

@Component
public class PaymentListener {

	public static final Logger log = LoggerFactory.getLogger(PaymentListener.class);
	
	private final ProcessPayment processPayment;
	
	public PaymentListener(ProcessPayment processPayment) {
		this.processPayment = processPayment;
	}

	@KafkaListener(
			topics = "Valid.Payments",
			groupId = "validation-group",
			containerFactory = "jsonContainerFactory"
	)
	public void validatePayment(@Payload Payment payment) throws InterruptedException {
		log.info("Validando pagamento ID={}, feito em {}", payment.getId(), 
				Formatter.formatDateTime(payment.getPaymentDate()));
		processPayment.process(payment);
		Thread.sleep(2000);
	}
	
	@KafkaListener(
			topics = "Valid.Payments",
			groupId = "email-group",
			containerFactory = "jsonContainerFactory"
	)
	public void generateEmail() throws InterruptedException {
		Thread.sleep(3000);
		log.info("Gerando Email de confirmação de pagamento ");
	}

}
