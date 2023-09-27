package com.finzly.BBC.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentModes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int paymentMode_Id;
	private String paymentModeName;
	private double discountPercentage;
	private final double rate=41.50;
	private final double discountOnDate = 5 ; 

	public double getRate() {
		return rate;
	}

	public double getDiscountOnDate() {
		return discountOnDate;
	}

	public PaymentModes() {
	
	}

	public PaymentModes(int paymentModeId) {
		this.paymentMode_Id = paymentModeId;
//		PaymentModeName = paymentModeName;
//		this.discountPercentage = discountPercentage;
	}

	public int getPaymentModeId() {
		return paymentMode_Id;
	}

	public void setPaymentModeId(int paymentModeId) {
		this.paymentMode_Id = paymentModeId;
	}

	public String getPaymentModeName() {
		return paymentModeName;
	}

	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
