package onetomany;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session; 
import org.hibernate.Transaction;

public class Store {
	private Session g; //calling helper class method
	public Store() {
			g= Helper.getSession();
			Transaction tr = g.beginTransaction();
	}
void storingData()throws HibernateException {
	BillingDetails b1=new BillingDetails();
	b1.setBill_amount(620.58f);
	b1.setBill_type("Electricity bill");
	b1.setOperator("TNEB");
	b1.setAccount_number("192537605");
	
	BillingDetails b2=new BillingDetails();
	b2.setBill_amount(980f);
	b2.setBill_type("Gas Cylinder");
	b2.setOperator("INDANE");
	b2.setAccount_number("PX00856B");

	
	BillingDetails b3=new BillingDetails();
	b3.setBill_amount(867.25f);
	b3.setBill_type("Broadband Bill");
	b3.setOperator("ACT Fibernet");
	b3.setAccount_number("102235796514");

	
	BillingDetails b4=new BillingDetails();
	b4.setBill_amount(290f);
	b4.setBill_type("DTH bill");
	b4.setOperator("TATA SKY");
	b4.setAccount_number("3000187546");
	
	ArrayList<BillingDetails> x = new ArrayList<>();
	x.add(b1);
	x.add(b2);
	x.add(b3);
	x.add(b4);

	CustomerDetails c1 = new CustomerDetails();
	c1.setName("Vignesh");
	c1.setPhone_number(9784563210l);
	c1.setMail_id("vicky07@gmail.com");
	c1.setBills(x);
	
	g.save(c1);
	g.getTransaction().commit();
	g.close();
	System.out.println("Bill payments made successfully");
}
		public static void main(String[] args) {
			try {
			System.out.println("Bill payment details....");			
			Store st=new Store();
			st.storingData();
			}
			catch(HibernateException u) {
				System.out.println("Hibernate error:" +u);	//shows error in hibernate		
			}
			catch(Exception y) {
				System.out.println("error:" +y);	//shows normal error		
			}
		}
}
