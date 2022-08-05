package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Address address =  new Address(121,"MGRoad","Bangalore");
		Person p = new Person("praveen",302,address);
		System.out.println(p);
		
		
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Address adr1 = (Address) context.getBean("adr");
		//System.out.println(adr1);
		
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		
		Person p2 = (Person) context.getBean("p2");
		System.out.println(p2);
		
		Questions q = (Questions) context.getBean("qns");
		System.out.println(q);
		
		DbConn dbc = (DbConn) context.getBean("db");
		dbc.executeTransactions();
		
		
		

	}

}
