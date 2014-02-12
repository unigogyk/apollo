package ustc.sse.apollo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import ustc.sse.apollo.dao.UstcUserDao;
import ustc.sse.apollo.model.UstcUser;

@Repository
public class UstcUserDaoImpl extends GeneralDaoImpl implements UstcUserDao {
	
	@Override
	public void addUser(UstcUser user) {
		
		getHibernateTemplate().save(user);
	}

	@Override
	public void findUserById(int id) {
		
	}

	@Override
	public List<UstcUser> ListAllUser() {
		
		return null;
	}

	@Override
	public List<UstcUser> showUser(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delUser(UstcUser user) {
		// TODO Auto-generated method stub
		
	}

	
	
}
