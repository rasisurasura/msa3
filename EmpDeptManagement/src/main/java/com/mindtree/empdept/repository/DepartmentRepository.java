
package com.mindtree.empdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindtree.empdept.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
