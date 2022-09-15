package net.springboot.javaguides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.springboot.javaguides.service.EmployeeService;

@Controller 
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	//display list of employee 
	@GetMapping("/")
public String viewHomePage(Model model) {
		
	model.addAttribute("listEmployees",employeeService.getAllEmployees());
	return "index"; 
	
}
}
