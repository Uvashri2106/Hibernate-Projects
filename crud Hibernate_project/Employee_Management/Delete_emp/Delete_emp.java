package Hibernate_projects.Employee_Info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Delete_emp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee_details.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction t= session.beginTransaction();
		
		try {
			int Employee_id=2;
			Employee_details g=session.get(Employee_details.class, Employee_id);
			session.delete(g);
			t.commit();

		} finally {

			sessionFactory.close();
		}
	}
}
