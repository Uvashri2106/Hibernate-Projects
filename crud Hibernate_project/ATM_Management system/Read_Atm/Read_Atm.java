package Hibernate_projects.ATM_management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Read_Atm {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Atm_demo.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tr= session.beginTransaction();
		
		try {
			int Account_Number=4004;
			Atm_demo atm=session.get(Atm_demo.class, Account_Number);
			System.out.println("Account_Number:"+atm.getAccount_Number());
			System.out.println("Account_HolderName:"+atm.getAccount_HolderName());
			System.out.println("Contact_Numeber:"+atm.getContact_Number());
			System.out.println("Branch:"+atm.getBranch());

			tr.commit();		
}
		finally {
			sessionFactory.close();
		}
}

}
