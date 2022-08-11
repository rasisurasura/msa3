
package com.mindtree.empdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.empdept.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
