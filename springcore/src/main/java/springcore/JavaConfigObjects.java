package springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigObjects {
	
	@Bean("b1")
	public Address getAddress() {
		return new Address(1010,"SP Road","Hyderabad");
	}
	
	@Bean
	public Person getPersons() {
		return new Person("Kumar",9087,getAddress());
	}
}
