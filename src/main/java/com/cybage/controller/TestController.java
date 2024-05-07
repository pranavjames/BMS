package com.cybage.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setEmpId(1000);
		emp.setName("Manish");
		emp.setDesignation("Manager");
		emp.setSalary(3000);

		return emp;
	}

}