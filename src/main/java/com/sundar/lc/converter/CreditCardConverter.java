package com.sundar.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.sundar.lc.api.CreditCardDTO;

public class CreditCardConverter implements Converter<String, CreditCardDTO> {

	@Override
	public CreditCardDTO convert(String creditCard) {
		
		String[] num = creditCard.split("-");

		CreditCardDTO cardDTO = new CreditCardDTO();

		cardDTO.setFirstInteger(Integer.parseInt(num[0]));
		cardDTO.setSecondnteger(Integer.parseInt(num[1]));
		cardDTO.setThirdInteger(Integer.parseInt(num[2]));
		cardDTO.setFourthInteger(Integer.parseInt(num[3]));

		return cardDTO;
	}

}
