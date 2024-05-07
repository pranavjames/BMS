package com.cybage.demo;

import java.util.List;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Book;
import com.cybage.model.Employee;

@SpringBootApplication
@RestController
public class SpringMvcApp1Application {
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/findallbooks")
	public ResponseEntity<List<Book>> getBooks(){
		return ResponseEntity.ok(Stream.of(new Book(10, "Java", 100),
				new Book(11, "Java", 102), new Book(12, "Java", 103),
				new Book(10, "Java", 108)).collect(Collectors.toList()));
				
		
	}

	@GetMapping("/employee")
	public List<Employee> getemployees(){
		return Stream.of(new Employee(10, "Java", "Manager", 7283.0)).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApp1Application.class, args);
	}

}
