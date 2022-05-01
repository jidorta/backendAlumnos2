package com.ibandorta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibandorta.entity.Employee;
import com.ibandorta.repository.EmployeeRepository;

@SpringBootApplication
@RestController
public class BackendAlumnosApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/message")
	public String message() {
		return "Felicidades crack";
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee>getEmployees(){
		return employeeRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendAlumnosApplication.class, args);
	}

}
