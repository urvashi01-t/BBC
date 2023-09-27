package com.finzly.BBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.BBC.Dao.EmployeeDao;
import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Entity.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeDao empDao;

	public  List<Employee> getAllEmployees() {
		
		return empDao.getAllEmployees();
	}

	public String addEmployee(Employee employee) {
		
		return empDao.addEmployee(employee);
	}


}
