package Hibernate_projects.Employee_Info;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Create_emp {
	public static void main(String[] args) {
		// creating a Session Factory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee_details.class).buildSessionFactory();
		// creating a Session
		Session session = sessionFactory.openSession();

		try {
			Transaction t = session.beginTransaction();

			System.out.println("Creating a new Employee object...");
			Employee_details emp1 = new Employee_details("Varun", 85000, "IT");
			Employee_details emp2 = new Employee_details("Sathya", 50000, "Accounts");
			Employee_details emp3 = new Employee_details("Bala", 60000, "HR");

			session.save(emp1);
			session.save(emp2);
			session.save(emp3);

			System.out.println("Java object saved to database");
			t.commit();
			session.close();
		} 
		catch (HibernateException g) {
			System.out.println("Hibernate " + g);
		}
	}
}
