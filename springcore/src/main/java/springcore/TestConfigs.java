package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		Address d1 = (Address)context.getBean("a2");
		System.out.println(d1);
		
		Person p= (Person) context.getBean(Person.class);
		System.out.println(p);

	}

}
