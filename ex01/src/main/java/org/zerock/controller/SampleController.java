package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	@RequestMapping()
	public void basic() {

		System.out.println("basic................");

	}

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basicGet() {
		System.out.println("basic get................");
	}

	@RequestMapping(value = "/basicOnlyGet")
	public void basicOnlyGet() {
		System.out.println("basicOnlyGet................");
	}

	@GetMapping(value = "/ex01")
	public void ex01(SampleDTO dto) {
		System.out.println(dto);
	}

	@GetMapping(value = "/ex02")
	public void ex01(@RequestParam("name") String name, @RequestParam("age") int age) {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}

	@GetMapping(value = "/ex02List")
	public void ex02(@RequestParam("ids") ArrayList<String> ids) {
		System.out.println(ids);
	}

	@GetMapping(value = "/ex03")
	public void ex03(TodoDTO todo) {
		System.out.println(todo);
	}

	@GetMapping(value = "/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		System.out.println("dto:" + dto);
		System.out.println("page:" + page);

		String s = "/sample" + "/ex04";

		return s;
	}

	@GetMapping(value = "/ex06")
	public @ResponseBody SampleDTO ex06() {
		System.out.println("/ex06.........");

		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("이르름");

		return dto;
	}

	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {
		System.out.println("/ex07.........");

		String msg = "{\"name\":\"홍길동\"}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");

		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}

	@GetMapping("/exUpload")
	public void exUpload() {
		System.out.println("/exUpload.............");
	}

	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file -> {
			System.out.println("--------------------------------------");
			System.out.println("name:" + file.getOriginalFilename());
			System.out.println("size:" + file.getSize());
		});
	}
}
