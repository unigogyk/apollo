package ustc.sse.apollo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
	
	
	
	@RequestMapping(value="/success.html")
	public String success(){
		return "success";
	}
	
}
