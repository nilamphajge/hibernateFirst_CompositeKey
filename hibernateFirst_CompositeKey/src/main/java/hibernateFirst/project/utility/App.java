package hibernateFirst.project.utility;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernateFirst.project.entity.Address;
import hibernateFirst.project.entity.Student;
import hibernateFirst_project.entity.Ids.StudentsId;

public class App {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		
		SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(StudentsId.class)
                .addAnnotatedClass(Address.class)
                .buildSessionFactory();
                
Session session = sessionFactory.openSession();
Transaction transaction = (Transaction) session.getTransaction();

//	
	Student student = new Student();
	student.setName("Babita");
	//student.setCountry("India");
	student.setAge(26);
	
	Address address = new Address();
	address.setAddress_line1("Adinath appartment");
	address.setAddress_line2("3rd floor oposite brama hotel");
	address.setCity("Pune");
	address.setCountry("India");
	
	session.save(student);
	session.save(address);
//	Student student = session.get(Student.class,new StudentsId("Nilame", "India"));
//	System.out.println(student);
	
	
	sessionFactory.close();
	transaction.commit();

	}

}
