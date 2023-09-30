package com.projectRaj.EmployeeAddress.controller;

import com.projectRaj.EmployeeAddress.models.Employee;
import com.projectRaj.EmployeeAddress.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("api/Employees")

    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("api/Employees/{EmployeeId}")
    public Object getEmployeeById( @PathVariable Long EmployeeId){
        return employeeService.getEmployeeById(EmployeeId);
    }

    @PostMapping("api/Employees")
    public String addEmployees(@RequestBody @Valid List<Employee> Employees){
        return employeeService.addEmployees(Employees);
    }

    @PutMapping("api/Employees/{EmployeeId}")
    public String updateEmployeeById(@PathVariable Long EmployeeId, @RequestBody @Valid Employee newEmployee){
        return employeeService.updateEmployeeById(EmployeeId,newEmployee);
    }

    @DeleteMapping("api/Employees/{EmployeeId}")
    public String deleteEmployeeById(@PathVariable Long EmployeeId){
        return employeeService.deleteEmployeeById(EmployeeId);
    }
}
