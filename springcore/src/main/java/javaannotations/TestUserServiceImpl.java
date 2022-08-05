package javaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestUserServiceImpl {

	@Autowired
	@Qualifier("free")
	UserService service;

	public String getUserServiceDetails() {
		return service.getServiceType();
	}

}