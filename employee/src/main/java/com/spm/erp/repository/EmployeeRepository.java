package com.spm.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spm.erp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "SELECT * FROM employee where id = ?1 ; ", nativeQuery = true)
	Employee getEmployeeById(Integer id);
}
