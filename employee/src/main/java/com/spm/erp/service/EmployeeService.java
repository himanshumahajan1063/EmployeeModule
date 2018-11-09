package com.spm.erp.service;

import java.util.List;

import com.spm.erp.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeDetail(Integer id);

}
