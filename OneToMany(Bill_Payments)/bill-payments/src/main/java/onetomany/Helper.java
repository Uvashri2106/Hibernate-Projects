package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Helper {
	public static Session getSession() {
	Configuration cf = new Configuration();
	cf = cf.configure("hibernate.cfg.xml");
	SessionFactory sf = cf.buildSessionFactory();
	Session s = sf.openSession();
	return s;
	}
}
