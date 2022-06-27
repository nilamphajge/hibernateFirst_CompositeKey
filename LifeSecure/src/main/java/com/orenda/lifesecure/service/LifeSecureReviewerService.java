package com.orenda.lifesecure.service;

import java.util.List;

import com.orenda.lifesecure.model.Agent;
import com.orenda.lifesecure.model.CustomerStatus;
import com.orenda.lifesecure.model.User;

public interface LifeSecureReviewerService {

	

	List<Agent> getAllEmpList();

	void validateCustomer(CustomerStatus cStatus);



}
