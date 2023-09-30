package com.projectRaj.EmployeeAddress.repo;

import com.projectRaj.EmployeeAddress.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
