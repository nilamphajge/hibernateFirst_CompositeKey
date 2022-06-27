package com.orenda.lifesecure.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orenda.lifesecure.model.PolicyDetails;
import com.orenda.lifesecure.model.TransactionHistory;
import com.orenda.lifesecure.model.User;
import com.orenda.lifesecure.model.UserDetails;

@Repository
public class LifeSecureCustomerDaoImpl implements LifeSecureCustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public UserDetails getCustomer() {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserDetails where email=?");
		UserDetails customer = (UserDetails) query.setParameter(0, "amit@gmail.com").getSingleResult();

		return customer;

	}

	@Override
	public PolicyDetails getCustomer1() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from PolicyDetails where policyId=?");
		PolicyDetails customer1 = (PolicyDetails) query.setParameter(0, 1).getSingleResult();
		return customer1;
		
		
	}



	@Override
	public List<TransactionHistory> getAllTransactionList() {

		Session session = sessionFactory.openSession();

		List<TransactionHistory> transaction = session.createCriteria(TransactionHistory.class).list();

		return transaction;
	}
	
	
	

@Override
public UserDetails editUserRecord(int userId) {
	Session session = sessionFactory.getCurrentSession();
	UserDetails customer = session.get(UserDetails.class, userId);
	return customer;
}
}