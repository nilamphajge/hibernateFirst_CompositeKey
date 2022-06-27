package com.orenda.lifesecure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orenda.lifesecure.dao.LifeSecureAgentDao;
import com.orenda.lifesecure.dao.LifeSecureLoginDao;
import com.orenda.lifesecure.dao.LifeSecureReviewerDao;
import com.orenda.lifesecure.model.Agent;
import com.orenda.lifesecure.model.CustomerStatus;
import com.orenda.lifesecure.model.User;

@Service
public class LifeSecureReviewerServiceImpl implements LifeSecureReviewerService {

	@Autowired
	LifeSecureReviewerDao reviewerDao;

	
	@Override
	public List<Agent> getAllEmpList() {
		
		return reviewerDao.getAllEmplist();
	}

	@Override
	public void validateCustomer(CustomerStatus cStatus) {
		System.out.println(cStatus.toString());
		 reviewerDao.validateCustomerDb(cStatus);
		 
	}

	



}
