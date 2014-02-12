package ustc.sse.apollo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ustc.sse.apollo.dao.UstcUserDao;
import ustc.sse.apollo.model.UstcUser;
import ustc.sse.apollo.service.UstcUserService;

@Service
public class UstcUserServiceImpl implements UstcUserService{

	private UstcUserDao userDao;
	
	@Override
	public void addUser(UstcUser user) {
		userDao.addUser(user);
	}
	
	
	
	
	

	public UstcUserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UstcUserDao userDao) {
		this.userDao = userDao;
	}

	
}
