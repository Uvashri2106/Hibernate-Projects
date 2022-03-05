package Hibernate_projects.ATM_management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
class Update_Atm {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Atm_demo.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction t= session.beginTransaction();

		try {
			int Account_Number=4002;
			Atm_demo atm=session.get(Atm_demo.class, Account_Number);
			atm.setBranch("Kochi");;
			t.commit();

		} finally {

			sessionFactory.close();
		}
}
}
