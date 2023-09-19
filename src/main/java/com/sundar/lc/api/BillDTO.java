package com.sundar.lc.api;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class BillDTO {

	private BigDecimal amount;
	private Currency currency;
	private Date date;
	private CreditCardDTO creditCard;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CreditCardDTO getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCardDTO creditCard) {
		this.creditCard = creditCard;
	}

}
