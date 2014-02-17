package ustc.sse.apollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ustc.sse.apollo.service.UstcUserService;

@Controller
public class AdminController {
	
	@Autowired
	private UstcUserService userService;
	
	@RequestMapping(value="/admin/listAllUser.action")
	public String listUserPage(){
		return "listuser";
	}
	
	@RequestMapping(value="/admin/listuser.html")
	public ModelAndView listAllUser(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("UstcUsers",userService.ListAllUser());
		
		return mv;
	}

	public UstcUserService getUserService() {
		return userService;
	}

	public void setUserService(UstcUserService userService) {
		this.userService = userService;
	}
	
	
}
