package com.spm.erp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spm.erp.model.Employee;
import com.spm.erp.repository.EmployeeRepository;
import com.spm.erp.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }


	@Override
	public Employee getEmployeeDetail(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}


}
