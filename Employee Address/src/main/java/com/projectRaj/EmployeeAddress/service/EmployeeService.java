package com.projectRaj.EmployeeAddress.service;

import com.projectRaj.EmployeeAddress.models.Address;
import com.projectRaj.EmployeeAddress.models.Employee;
import com.projectRaj.EmployeeAddress.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Object getEmployeeById(Long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(employeeId);
        if(optionalEmployee.isPresent())
        {
            return optionalEmployee;
        }
        return "Employee with id : "+employeeId + " not available";
    }

    public String addEmployees(List<Employee> employees) {
        employeeRepo.saveAll(employees);
        return employees.size()+" Employees has been added";
    }

    public String updateEmployeeById(Long employeeId, Employee newEmployee) {
        Optional<Employee> optionalAddress = employeeRepo.findById(employeeId);
        if(optionalAddress.isPresent()){
            employeeRepo.save(newEmployee);
            return "Employee with id : "+employeeId + " is updated";
        }
        return "Employee with id : "+employeeId + " not available";
    }

    public String deleteEmployeeById(Long employeeId) {
        Optional<Employee> optionalAddress = employeeRepo.findById(employeeId);
        if(optionalAddress.isPresent()){
            employeeRepo.deleteById(employeeId);
            return "Employee with id : "+employeeId + " has been deleted";
        }
        return "Employee with id : "+employeeId + " not available";
    }
}
