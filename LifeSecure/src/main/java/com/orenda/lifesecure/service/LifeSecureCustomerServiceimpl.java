package com.orenda.lifesecure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orenda.lifesecure.dao.LifeSecureCustomerDao;
import com.orenda.lifesecure.model.PolicyDetails;
import com.orenda.lifesecure.model.TransactionHistory;
import com.orenda.lifesecure.model.User;
import com.orenda.lifesecure.model.UserDetails;

@Service
public class LifeSecureCustomerServiceimpl implements LifeSecureCustomerService {
    
	@Autowired
	LifeSecureCustomerDao loginCustomerDao;
	
	
	@Override
	public UserDetails getCustomer() {
		
		return loginCustomerDao.getCustomer();
	}
	@Override
	public PolicyDetails getCustomer1() {
		
		return loginCustomerDao.getCustomer1();
	}


	@Override
	public List<TransactionHistory> getAllTransactionList() {
	
		return loginCustomerDao.getAllTransactionList();
	}
	
	
	@Override
	public UserDetails editUserDetailsById(int userId) {
		
		return loginCustomerDao.editUserRecord(userId);
	}

	


	
}
