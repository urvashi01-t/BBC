package com.finzly.BBC.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBC.Entity.Customer;
import com.finzly.BBC.Entity.CustomerBill;

@Repository
public class BulkUserRepository {
	@Autowired
	SessionFactory factory;

	public List<Customer> UploadData(List<CustomerBill> customerBillList) {
		 System.out.print("work!s1");
		Session empSession = factory.openSession()	;
		Criteria criteria = empSession.createCriteria(Customer.class);
		 System.out.print("work!s2");
			return criteria.list() ;
		
	}

}
