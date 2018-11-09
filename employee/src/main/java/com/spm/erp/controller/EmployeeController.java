package com.spm.erp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spm.erp.model.Employee;
import com.spm.erp.repository.EmployeeRepository;
import com.spm.erp.service.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	@Autowired
	EmployeeService service;

	@GetMapping("/employee")
	public List<Employee> getEmployeeList() {
		return service.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeDetail(@PathVariable Integer id) {
		return service.getEmployeeDetail(id);
	}
}
