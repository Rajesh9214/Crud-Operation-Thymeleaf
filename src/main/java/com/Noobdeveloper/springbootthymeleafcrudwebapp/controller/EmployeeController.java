package com.Noobdeveloper.springbootthymeleafcrudwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Noobdeveloper.springbootthymeleafcrudwebapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployee", employeeService.getAllEmployees());
		return "index"; 
	}
	

}
