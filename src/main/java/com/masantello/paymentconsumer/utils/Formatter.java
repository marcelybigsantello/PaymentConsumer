package com.masantello.paymentconsumer.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {
	
	private static final String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss";
	private static final String TWO_DECIMAL_PLACES = "%.2f";

	public static String formatDateTime(LocalDateTime dateTime) {
		if (dateTime != null) {			
			return dateTime.format(DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));
		}
		
		return null;
	}
	
	public static String formatPrice(Float price) {
		Locale.setDefault(Locale.US);
		if (price != null) {
			return String.format(TWO_DECIMAL_PLACES, price);
		}
		
		return null;
	}
}
