package Hibernate_projects.ATM_management;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Create_Atm {
	public static void main(String[] args) {
		// creating a Session Factory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Atm_demo.class).buildSessionFactory();
		// creating a Session
		Session session = sessionFactory.openSession();

		try {
			Transaction tr = session.beginTransaction();
			System.out.println("The details are.....");
			Atm_demo c1 = new Atm_demo(4001,"Anjali", 978912453, "Chennai");
			Atm_demo c2 = new Atm_demo(4002,"Pavithra", 860987635, "Banglore");
			Atm_demo c3 = new Atm_demo(4003,"Shalini", 982653709, "Hyderabad");
			Atm_demo c4 = new Atm_demo(4004,"Yamuna", 901283456, "Coimbatore");

			session.save(c1);
			session.save(c2);
			session.save(c3);
			session.save(c4);
System.out.println("Atm management is saved");
			tr.commit();
			session.close();
		} 
		catch (HibernateException a) {
			System.out.println("Hibernate " + a);
		}
	}
}
