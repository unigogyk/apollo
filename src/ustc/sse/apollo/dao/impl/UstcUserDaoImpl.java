package ustc.sse.apollo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ustc.sse.apollo.dao.UstcUserDao;
import ustc.sse.apollo.model.UstcUser;
import ustc.sse.apollo.util.BusinessException;

@Repository
public class UstcUserDaoImpl extends AbstractSpringDAO<UstcUser> implements UstcUserDao {
	
	@Override
	public void addUser(UstcUser user) {
		try {
			addEntity(user);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public UstcUser findUserById(int id) {
		UstcUser user = null;
		try{
			user = findById(id);
		} catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<UstcUser> ListAllUser() {
		List<UstcUser> list = new ArrayList<UstcUser>();
		try{
			list = findAllEntity();
		} catch(BusinessException e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<UstcUser> showUser(String hql) {
		List<UstcUser> list = new ArrayList<UstcUser>();
		try {
			list = findByHql(hql);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void delUser(UstcUser user) {
		try {
			delEntity(user);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(UstcUser user){
		try{
			updateEntity(user);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
