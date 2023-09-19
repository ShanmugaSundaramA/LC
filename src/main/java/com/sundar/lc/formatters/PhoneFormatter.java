package com.sundar.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.sundar.lc.api.PhoneDTO;

public class PhoneFormatter implements Formatter<PhoneDTO> {

	@Override
	public String print(PhoneDTO phone, Locale locale) {
		
		System.out.println("2) Inside Formatter print(). ");
		
		return phone.getCountryCode()+"-"+phone.getUserNumber();
	}

	@Override
	public PhoneDTO parse(String text, Locale locale) throws ParseException {
		
		System.out.println("3) Inside Formatter parse(). ");
		
		String number[] = text.split("-");
		
		PhoneDTO phone =new PhoneDTO();
		
		phone.setCountryCode(number[0]);
		phone.setUserNumber(number[1]);
		
		return phone;
	}

}
