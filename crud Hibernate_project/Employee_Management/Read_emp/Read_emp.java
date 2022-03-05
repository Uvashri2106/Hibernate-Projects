package Hibernate_projects.Employee_Info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Read_emp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee_details.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tr= session.beginTransaction();
		
		try {
			int Id=3;
			Employee_details emp=session.get(Employee_details.class, Id);
			System.out.println("Employee_id:"+emp.getEmployee_id());
			System.out.println("Employee_Name:"+emp.getEmployee_Name());
			System.out.println("Employee_Salary:"+emp.getEmployee_Salary());

			tr.commit();		
}
		finally {
			sessionFactory.close();
		}
}
}
