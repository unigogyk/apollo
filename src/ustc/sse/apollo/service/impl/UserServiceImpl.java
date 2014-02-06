package ustc.sse.apollo.service.impl;

import org.springframework.stereotype.Service;

import ustc.sse.apollo.model.User;
import ustc.sse.apollo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public void addUser(User user) {
		System.out.println("add user --- service");
	}

	
}
