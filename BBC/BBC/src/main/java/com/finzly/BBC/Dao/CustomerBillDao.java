package com.finzly.BBC.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Entity.Employee;

@Repository
public class CustomerBillDao {
@Autowired
SessionFactory customerBillFactory;

	public String generateNewBill(CustomerBill customerBill) {
		Session session = customerBillFactory.openSession();
		session.save(customerBill);
		session.beginTransaction().commit();
		return " bill generated Successfully!!";
	}

	public List<CustomerBill> getAllBill() {
		Session Session = customerBillFactory.openSession()	;
		Criteria criteria = Session.createCriteria(CustomerBill.class);
		return criteria.list() ;
	}

	public List<CustomerBill> getAllInvoice() {
		Session Session = customerBillFactory.openSession()	;
		Criteria criteria = Session.createCriteria(CustomerBill.class);
			return criteria.list() ;
	}

	public List<CustomerBill> getAllPendingBills() {
		Session session = customerBillFactory.openSession();
		Criteria criteria=session.createCriteria(CustomerBill.class);
		return  criteria.list() ;
	}

	public String getPtos(CustomerBill c) {
		Session session = customerBillFactory.openSession();
		Criteria criteria = session.createCriteria(CustomerBill.class);
		session.saveOrUpdate(c);
		session.beginTransaction().commit();
		return "Done";
	}

	public List<Employee> getAllTranction() {
		Session session = customerBillFactory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		return  criteria.list() ;
	}

}
