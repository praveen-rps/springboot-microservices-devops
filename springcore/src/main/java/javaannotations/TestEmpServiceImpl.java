package javaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestEmpServiceImpl {
	
	@Autowired
	public EmpServiceImpl service;
	
	public void getEmpServieType() {
		service.getServiceType();
	}

}
