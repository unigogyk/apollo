package ustc.sse.apollo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ustc.sse.apollo.model.UstcUser;
import ustc.sse.apollo.service.UstcUserService;


@Controller
public class SystemController {
	
	@Autowired
	private UstcUserService userService;
	
	Logger logger = Logger.getLogger("SystemController");

	@RequestMapping(value="/")
	public String index(){
		logger.info("This is : /");
		return "index";
	}
	
	@RequestMapping(value="/index.html")
	public ModelAndView indexPage(){
		logger.info("This is : index.html");
		return new ModelAndView();
	}
	
	@RequestMapping(value="/test.html")
	public ModelAndView testPage(){
		logger.info("This is : test.html");
		return new ModelAndView();
	}
	
	@RequestMapping(value="/adduser.html")
	public String addUser(){
		return "adduser";
	}
	
	@RequestMapping(value="/adduser.do")
	public String addUser(HttpServletRequest request){
		UstcUser user = new UstcUser();
		user.setStuno(request.getParameter("stuno"));
		user.setPassowrd(request.getParameter("password"));

		userService.addUser(user);
		return "success";
	}
	
	@RequestMapping(value="/success.html")
	public String success(){
		return "success";
	}
	
}
