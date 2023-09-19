package com.sundar.lc.propertyEditor;

import java.beans.PropertyEditorSupport;

import com.sundar.lc.api.CreditCardDTO;

public class CreditCardPropertyEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		return getValue().toString();
	}
	
	@Override
	public void setAsText(String creditCard) throws IllegalArgumentException {

		String[] num = creditCard.split("-");

		CreditCardDTO cardDTO = new CreditCardDTO();

		cardDTO.setFirstInteger(Integer.parseInt(num[0]));
		cardDTO.setSecondnteger(Integer.parseInt(num[1]));
		cardDTO.setThirdInteger(Integer.parseInt(num[2]));
		cardDTO.setFourthInteger(Integer.parseInt(num[3]));

		setValue(cardDTO);
		
	}
}
