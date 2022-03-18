package onetomany;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
private Session c;

public Update() {
	c= Helper.getSession();
	Transaction tr = c.beginTransaction();
	}
void updatingValues() throws HibernateException {
	int customer_id=1;
	CustomerDetails upd=c.find(CustomerDetails.class, customer_id);
	upd.setName("Dinesh");
	upd.setMail_id("dinesh01@gmail.com");
	c.update(upd);
    c.getTransaction().commit();
    c.close();
}
public static void main(String[] args) {
	try {
		Update f= new Update();
		f.updatingValues();
	}
	
	catch(HibernateException d) {
		System.out.println("updated value:" +d);	//shows error in hibernate		
	}
	}
}

