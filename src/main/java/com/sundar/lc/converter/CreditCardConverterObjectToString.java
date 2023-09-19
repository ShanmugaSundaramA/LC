package com.sundar.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.sundar.lc.api.CreditCardDTO;

public class CreditCardConverterObjectToString implements Converter<CreditCardDTO, String>{

	@Override
	public String convert(CreditCardDTO creditCard) {
		return creditCard.toString();
	}

}
