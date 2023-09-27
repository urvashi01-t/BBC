package com.finzly.BBC.Entity;

import java.util.Date; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CustomerBill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	private Date startDate;
	private Date endDate;
	private Date dueDate;
	private int consumedUnit;
	private double amount;
	
	@OneToOne
	private PaymentModes paymentModeId;
	private String status;
	private String month;
	private double totalamount;
	@OneToOne

	private Customer customerId;

	public Customer getCustomerId() {
		return customerId;
	}

	public CustomerBill( Date startDate, Date endDate, Date dueDate, int consumedUnit, double amount,
		 String status, String month, Customer customerId) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.dueDate = dueDate;
		this.consumedUnit = consumedUnit;
		this.amount = amount;
//		this.paymentModeId = paymentModeId;
		this.status = status;
		this.month = month;
		this.customerId = customerId;
	}

	public CustomerBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public void setCustomerId(Customer customerIds) {
		this.customerId = customerIds;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public int getConsumedUnit() {
		return consumedUnit;
	}

	public void setConsumedUnit(int consumedUnit) {
		this.consumedUnit = consumedUnit;
	}

	public double getAmount() {
		return amount=getConsumedUnit()*paymentModeId.getRate();
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentModes getPaymentModeId() {
		return paymentModeId;
	}

	public void setPaymentModeId(PaymentModes paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	
}
