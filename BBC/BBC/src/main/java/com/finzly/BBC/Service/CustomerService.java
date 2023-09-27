package com.finzly.BBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.BBC.Dao.CustomerDao;
import com.finzly.BBC.Entity.Customer;

@Service
public class CustomerService {
@Autowired
CustomerDao customerDao;
	public String insertCustomer(Customer customer) {
		
		return customerDao.insertCustomer(customer);
	}
	public String updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
		
	}
	public List<Customer> getAllCustomer() {
		
		return customerDao.getAllCustomer();
	}

}
