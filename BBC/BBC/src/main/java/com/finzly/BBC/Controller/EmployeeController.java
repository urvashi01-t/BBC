package com.finzly.BBC.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Entity.Employee;
import com.finzly.BBC.Service.EmployeeService;

@RestController

public class EmployeeController {
@Autowired
EmployeeService empService;
@GetMapping("getEmployeeList")
public  List<Employee> getAllEmployees() {
	return empService.getAllEmployees() ;
}

@PostMapping("addEmployee")
public String addEmployee(@RequestBody Employee employee) {
	return empService.addEmployee(employee);
}






























































}
