package com.finzly.BBC.Dao;
import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Entity.Employee;

@Repository
public class EmployeeDao {
@Autowired
SessionFactory empFactory;
	public List<Employee> getAllEmployees() {
	Session empSession = empFactory.openSession()	;
	Criteria criteria = empSession.createCriteria(Employee.class);
		return criteria.list() ;
	}
	public String addEmployee(Employee employee) {
		Session session = empFactory.openSession();
		session.save(employee);
		session.beginTransaction().commit();
		return "Book Inserted in to table";
	}


}
