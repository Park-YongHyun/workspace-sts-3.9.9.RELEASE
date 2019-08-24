package com.sts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Tmp1Controller {
	
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String ajaxEx1() {
		return "tmp1-1";
	}
	
}
