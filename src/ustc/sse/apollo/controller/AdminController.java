package ustc.sse.apollo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ustc.sse.apollo.model.UstcUser;
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
	
	@RequestMapping(value="/admin/deluser.action")
	public String delUser(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		UstcUser user = userService.findUserById(id);
		userService.delUser(user);
		return "redirect:/admin/listuser.html";
	}
	
	@RequestMapping(value="/admin/updateuser.action")
	public String updateUser(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		UstcUser user = userService.findUserById(id);
		
		user.setStuno(request.getParameter("stuno"));
		user.setpassword(request.getParameter("password"));
		
		userService.updateUser(user);
		return "redirect:/admin/listuser.html";
	}

	@RequestMapping(value="/admin/finduser.action")
	public String findUser(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		return "redirect:userinfo.html?id=" + id;
	}
	
	@RequestMapping(value="/admin/userinfo.html")
	public ModelAndView findUserPage(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		
		int id = Integer.parseInt(request.getParameter("id"));
		UstcUser user = userService.findUserById(id);
		
		System.out.println(user.getStuno());
		System.out.println(user.getpassword());
		mv.addObject("ustcuser", user);
		
		return mv;
	}
	
	@RequestMapping(value="/admin/edituser.html")
	public ModelAndView editUserPage(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		
		int id = Integer.parseInt(request.getParameter("id"));
		UstcUser user = userService.findUserById(id);
		
		mv.addObject("ustcuser", user);
		
		return mv;
	}
	
	public UstcUserService getUserService() {
		return userService;
	}

	public void setUserService(UstcUserService userService) {
		this.userService = userService;
	}
	
	
}
