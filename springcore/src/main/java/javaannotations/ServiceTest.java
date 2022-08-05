package javaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(UserServiceConfig.class);
		TestUserServiceImpl tst = context.getBean(TestUserServiceImpl.class);
		String result = tst.getUserServiceDetails();
		System.out.println(result);
	}
}
