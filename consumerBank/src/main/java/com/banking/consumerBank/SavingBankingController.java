package com.banking.consumerBank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavingBankingController {
	
	@RequestMapping(value="/fdDetails",method=RequestMethod.GET)
	public FdDetails getSavingBalanceDtl(){
		return new FdDetails("CITY-101",500d);
	}

}
