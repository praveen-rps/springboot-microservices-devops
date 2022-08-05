package javaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutowired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		TestEmpServiceImpl s = ctx.getBean(TestEmpServiceImpl.class);
		s.getEmpServieType();

	}

}
