
package com.mindtree.empdept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.empdept.entity.Employee;
import com.mindtree.empdept.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;

public Employee addOrUpdate(Employee employee) {
	return employeeRepository.save(employee);
}
public boolean deleteById(Long id) {
	employeeRepository.deleteById(id);
	return true;
}
public List<Employee>getAll(){
	return employeeRepository.findAll();
}
public Employee getById(Long id) {
	return employeeRepository.findById(id).get();
}
}
