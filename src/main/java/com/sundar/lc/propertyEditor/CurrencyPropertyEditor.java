package com.sundar.lc.propertyEditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class CurrencyPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String currencyText) throws IllegalArgumentException {

		Currency currency=Currency.getInstance(currencyText.toUpperCase());

		setValue(currency);

	}

}
