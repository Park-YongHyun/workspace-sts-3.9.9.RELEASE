package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.service.Tmp1DAO;

@Controller
public class Tmp1Controller { // Word Controller
	@Autowired
	Tmp1DAO tmp1DAO;
	
	@RequestMapping(value = "/1.do", method = RequestMethod.GET) // 페이지 진입
	public String tmp1page1a(Model model) { // 카드 리스트 페이지
		model.addAttribute("list", tmp1DAO.selectWordList());
		return "word/wordtable";
	}
	
}
