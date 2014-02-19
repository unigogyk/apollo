package ustc.sse.apollo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ustc.sse.apollo.dao.UstcUserDao;
import ustc.sse.apollo.model.UstcUser;
import ustc.sse.apollo.service.UstcUserService;

@Service
public class UstcUserServiceImpl implements UstcUserService{

	private UstcUserDao userDao;
	
	public UstcUserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UstcUserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(UstcUser user) {
		userDao.addUser(user);
	}
	

	@Override
	public List<UstcUser> ListAllUser() {
		return userDao.ListAllUser();
	}

	@Override
	public UstcUser findUserById(int id) {
		return userDao.findUserById(id);
	}

	@Override
	public List<UstcUser> showUser(String hql) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delUser(UstcUser user) {
		userDao.delUser(user);
	}

	@Override
	public void updateUser(UstcUser user) {
		userDao.updateUser(user);
	}
	
}
