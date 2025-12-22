package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String calculator() {
		
		return "calculator";
		
	}
	
	@RequestMapping("addPage")
	public String addPage() {
		
		return "addition";
		
	}
	
	@RequestMapping("subPage")
	public String subPage() {
		
		return "subtraction";
		
	}
	
	@RequestMapping("mulPage")
	public String mulPage() {
		
		return "multiplication";
		
	}
	
	@RequestMapping("divPage")
	public String divPage() {
		
		return "division";
		
	}
	
	@RequestMapping("add")
	public String addition(@RequestParam("firstNum") int num1, @RequestParam("secondNum") int num2, Model m ) {
		
		int result = num1 + num2;
		
		// System.out.println(num1 +" + "+ num2 +" = "+ result);
		
		
		m.addAttribute("num1", num1);
		m.addAttribute("num2", num2);
		m.addAttribute("op", "+");
		m.addAttribute("res", result);
		
		return "success";
	}
	
	@RequestMapping("sub")
	public String subtraction(@RequestParam("firstNum") int num1, @RequestParam("secondNum") int num2, Model m ) {
		
		int result = num1 - num2;
		
		// System.out.println(num1 +" - "+ num2 +" = "+ result);
		
		m.addAttribute("num1", num1);
		m.addAttribute("num2", num2);
		m.addAttribute("op", "-");
		m.addAttribute("res", result);
		
		return "success";
	}
	
	@RequestMapping("mul")
	public String multiplication(@RequestParam("firstNum") int num1, @RequestParam("secondNum") int num2, Model m ) {
		
		int result = num1 * num2;
		
		// System.out.println(num1 +" * "+ num2 +" = "+ result);
		
		m.addAttribute("num1", num1);
		m.addAttribute("num2", num2);
		m.addAttribute("op", "*");
		m.addAttribute("res", result);
		
		return "success";
	}
	
	@RequestMapping("div")
	public String division(@RequestParam("firstNum") int num1, @RequestParam("secondNum") int num2, Model m ) {
		
		int result = num1 / num2;
		
		// System.out.println(num1 +" / "+ num2 +" = "+ result);
		
		m.addAttribute("num1", num1);
		m.addAttribute("num2", num2);
		m.addAttribute("op", "/");
		m.addAttribute("res", result);
		
		return "success";
	}

}
