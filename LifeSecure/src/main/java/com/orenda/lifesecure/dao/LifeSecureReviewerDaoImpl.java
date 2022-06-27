package com.orenda.lifesecure.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orenda.lifesecure.model.Agent;
import com.orenda.lifesecure.model.CustomerStatus;
import com.orenda.lifesecure.model.User;

@Repository
@Transactional
public class LifeSecureReviewerDaoImpl implements LifeSecureReviewerDao {

	@Autowired
	SessionFactory sessionFactory;

	

	@Override
	public List<Agent> getAllEmplist() {
		
			Session session = sessionFactory.openSession();
			List<Agent> listOfCustomer = session.createCriteria(Agent.class).list();
			System.out.println(listOfCustomer);
			return listOfCustomer;
		}



	@Override
	public void validateCustomerDb(CustomerStatus cStatus) {
		Session session = sessionFactory.getCurrentSession();
		
		 session.saveOrUpdate(cStatus);
	}
	
	

	
	}

	
	



