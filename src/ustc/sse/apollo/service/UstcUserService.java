package ustc.sse.apollo.service;

import java.util.List;

import ustc.sse.apollo.model.UstcUser;

public interface UstcUserService {

	public void addUser(UstcUser user);
	
	public List<UstcUser> ListAllUser();
}
