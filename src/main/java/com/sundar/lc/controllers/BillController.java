package com.sundar.lc.controllers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundar.lc.api.BillDTO;
import com.sundar.lc.api.CreditCardDTO;
import com.sundar.lc.formatters.CreditCardFormatter;
import com.sundar.lc.propertyEditor.CreditCardPropertyEditor;
import com.sundar.lc.propertyEditor.CurrencyPropertyEditor;

@Controller
public class BillController {

	@RequestMapping("/bill")
	public String bill(@ModelAttribute("billDTO") BillDTO billDTO) {

		CreditCardDTO cardDTO = new CreditCardDTO();
		cardDTO.setFirstInteger(1111);
		cardDTO.setSecondnteger(2222);
		cardDTO.setThirdInteger(3333);
		cardDTO.setFourthInteger(4444);

		billDTO.setCreditCard(cardDTO);

		return "BillPage";
	}

	@RequestMapping("/process-Bill")
	public String processBill(@Valid @ModelAttribute("billDTO") BillDTO billDTO, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "BillPage";
		}

		return "BillResultPage";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);

		NumberFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);

		CurrencyPropertyEditor currencyEditor = new CurrencyPropertyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyEditor);

		//CreditCardPropertyEditor creditCardEditor = new CreditCardPropertyEditor();
		//binder.registerCustomEditor(CreditCardDTO.class, "creditCard", creditCardEditor);

		// binder.addCustomFormatter(new CreditCardFormatter());
	}

}
