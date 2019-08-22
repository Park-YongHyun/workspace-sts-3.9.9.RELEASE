package com.sts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChartController {
	
	@RequestMapping(value = "/chart_ex.do", method = RequestMethod.GET)
	public String chartEx() {
		return "chart_ex";
	}
}
