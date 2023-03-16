package com.banking.investmentBank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquityController {
	
	@RequestMapping(value="/equityBalance",method=RequestMethod.GET)
	public EquityDetails getEquityInvestMentDtl(){
		return new EquityDetails("CITY-101",100d,0d);
	}

}
