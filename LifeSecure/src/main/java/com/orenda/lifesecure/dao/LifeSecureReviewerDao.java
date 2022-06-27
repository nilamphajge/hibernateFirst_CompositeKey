package com.orenda.lifesecure.dao;

import java.util.List;

import com.orenda.lifesecure.model.Agent;
import com.orenda.lifesecure.model.CustomerStatus;
import com.orenda.lifesecure.model.User;

public interface LifeSecureReviewerDao {

	

	List<Agent> getAllEmplist();

	void validateCustomerDb(CustomerStatus cStatus);




	

}
