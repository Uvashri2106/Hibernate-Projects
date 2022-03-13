package One_To_One_Mapping.Spacecraft_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

class Merge {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session s = factory.openSession();

		Transaction tr = s.beginTransaction();

		Rocket r1 = new Rocket();
		r1.setName("CMS");

		Launch_details l = new Launch_details();
		l.setDateOfLaunch("19/11/2021");
		l.setApplication("Communication");
		l.setLaunchVehicle("PSLV");

		r1.setlaunching(l);
		l.setRocket(r1);

		s.persist(r1);
		tr.commit();

		s.close();
		System.out.println("Rocket launched successfully...");
	}
}
