package Hibernate_projects.ATM_management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
class Delete_Atm {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Atm_demo.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		
		try {
			int Account_Number=4003;
			Atm_demo b=session.get(Atm_demo.class, Account_Number);
			session.delete(b);
			t.commit();

		} finally {

			sessionFactory.close();
		}
	}
}
