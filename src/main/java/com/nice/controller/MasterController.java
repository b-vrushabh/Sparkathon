package com.nice.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.models.Security;

@RestController
public class MasterController {

	
	@GetMapping("/securities")
	public List<Security> getSecurities(){
		
		Security s1=new Security(1, "AMAZON", "111ODSH4");
		Security s2=new Security(2, "APPLE", "222ODSH4");
		
		List<Security> securities= new ArrayList<>();
		
		securities.add(s1);
		securities.add(s2);
		
		return securities;
	}
	
}
