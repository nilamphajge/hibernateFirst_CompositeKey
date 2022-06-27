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
import com.orenda.lifesecure.model.User;

@Repository
@Transactional
public class LifeSecureAgentDaoImpl implements LifeSecureAgentDao {

	@Autowired
	SessionFactory sessionFactory;

	

	@Override
	public List<Agent> getAllEmplist() {
		
			Session session = sessionFactory.openSession();
			List<Agent> listEmp = session.createCriteria(Agent.class).list();
			System.out.println(listEmp);
			return listEmp;
		}
	
	

	
	}

	
	



