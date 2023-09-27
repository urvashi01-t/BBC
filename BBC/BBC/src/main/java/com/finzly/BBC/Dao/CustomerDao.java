package com.finzly.BBC.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBC.Entity.Customer;

@Repository
public class CustomerDao {
@Autowired 
SessionFactory customerFactory;
public String insertCustomer (Customer customer) {
	Session session = customerFactory.openSession();
	session.save(customer);
	session.beginTransaction().commit();
	return "customer created Successfully!!";
}
public String updateCustomer(Customer customer) {
	Session session = customerFactory.openSession();
	session.update(customer);
	session.beginTransaction().commit();
	return "customer created Successfully!!";
}
public  List<Customer> getAllCustomer() {
	Session session = customerFactory.openSession();
	Criteria criteria = session.createCriteria(Customer.class);
	
	return criteria.list() ;
}


}
