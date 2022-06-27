package com.orenda.lifesecure.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "policy_details")
public class PolicyDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="policy_id")
	private int policyId;
	
	@Column(name="policy_type")
	private String policyType;
	
	@Column(name="policy_sdate")
	private Date policyStartDate;
	
	@Column(name="policy_edate")
	private Date policyEndDate;
	
	@Column(name="policy_pamount")
	private double premiumAmount;
	
	
	@OneToOne(mappedBy = "policyDetails")
	private UserDetails userdetails;
	

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public Date getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	@Override
	public String toString() {
		return "PolicyDetails [policyId=" + policyId + ", policyType=" + policyType + ", policyStartDate="
				+ policyStartDate + ", policyEndDate=" + policyEndDate + ", premiumAmount=" + premiumAmount + "]";
	}
	
}