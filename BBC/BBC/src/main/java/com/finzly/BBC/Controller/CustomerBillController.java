package com.finzly.BBC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.BBC.Entity.CustomerBill;
import com.finzly.BBC.Entity.Employee;
import com.finzly.BBC.Service.CustomerBillService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CustomerBillController {
	@Autowired
	CustomerBillService customerBillService;

	@PostMapping("newBill")
	public String generateNewBill(@RequestBody CustomerBill customerBill) {
		return customerBillService.generateNewBill(customerBill);
	}
	
	@GetMapping("/getAllBill")
	public  List<CustomerBill> getAllBill() {
		return customerBillService.getAllBill() ;
	}
	@GetMapping("getAllTranctionById/{id}")
	public List<Employee> getAllTranction(@PathVariable int id) {
		return customerBillService.getAllTranction(id);
	}
	@GetMapping("getAllPendingBills")
	public List<CustomerBill> getAllPendingBills() {
	return	customerBillService.getAllPendingBills();
	}
//	@GetMapping("Invoice")
//	public void invoice(@PathVariable int id) {
//		customerBillService.getInvoice(id);
//	}
	
	@GetMapping("getAllInvoice/{id}")
	public List<CustomerBill> getAllInvoice(@PathVariable int id){
		return customerBillService.getAllInvoice(id);
	}
	
	@GetMapping("getPaymenyById/{id}")
	public List<CustomerBill> getPaymenyById(@PathVariable int id){
		return customerBillService.getPaymenyById(id);
	}

	@GetMapping("getSavePaymentById")
	public List<CustomerBill> getPaymentById(){
		return customerBillService.getPaymentById();
	}
	
	@GetMapping("pendingTosucess/{id}")
	public String getPtos(@PathVariable int id) {
		return customerBillService.getPtos(id);
	}
	
}
