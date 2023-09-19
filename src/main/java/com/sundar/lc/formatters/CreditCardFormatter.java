package com.sundar.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.sundar.lc.api.CreditCardDTO;

public class CreditCardFormatter implements Formatter<CreditCardDTO> {

	@Override
	public String print(CreditCardDTO creditCard, Locale locale) {
		return creditCard.toString();
	}

	@Override
	public CreditCardDTO parse(String creditCard, Locale locale) throws ParseException {
		String[] num = creditCard.split("-");

		CreditCardDTO cardDTO = new CreditCardDTO();

		cardDTO.setFirstInteger(Integer.parseInt(num[0]));
		cardDTO.setSecondnteger(Integer.parseInt(num[1]));
		cardDTO.setThirdInteger(Integer.parseInt(num[2]));
		cardDTO.setFourthInteger(Integer.parseInt(num[3]));
 
		return cardDTO;
	}

}
