package ustc.sse.apollo.service;

import java.util.List;

import ustc.sse.apollo.model.UstcUser;

public interface UstcUserService {

	/**
	 * 添加单个用户
	 */
	public void addUser(UstcUser user);

	/**
	 * 根据id查找用户
	 */
	public UstcUser findUserById(int id);
	
	/**
	 * 查找所有用户
	 */
	public List<UstcUser> ListAllUser();

	/**
	 * 根据条件查找用户
	 */
	public List<UstcUser> showUser(String hql); 
	
	/**
	 * 删除用户
	 */
	public void delUser(UstcUser user);
	
	/**
	 * 更新用户信息
	 */
	public void updateUser(UstcUser user);
	
	
}
