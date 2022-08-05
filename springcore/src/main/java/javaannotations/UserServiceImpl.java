package javaannotations;

import org.springframework.stereotype.Component;

@Component("free")
public class UserServiceImpl implements UserService{

	@Override
	public String getServiceType() {
		// TODO Auto-generated method stub
		return "It is a free service";
	}

}

