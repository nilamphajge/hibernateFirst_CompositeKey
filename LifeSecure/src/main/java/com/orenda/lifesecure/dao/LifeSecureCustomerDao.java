package com.orenda.lifesecure.dao;


import java.util.List;

import com.orenda.lifesecure.model.PolicyDetails;
import com.orenda.lifesecure.model.TransactionHistory;
import com.orenda.lifesecure.model.User;
import com.orenda.lifesecure.model.UserDetails;

public interface LifeSecureCustomerDao {

	UserDetails getCustomer();

	
	PolicyDetails getCustomer1();
	
	UserDetails editUserRecord(int userId);



	List<TransactionHistory> getAllTransactionList();


	
		
	}


