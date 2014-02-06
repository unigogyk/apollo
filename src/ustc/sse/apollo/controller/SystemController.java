package ustc.sse.apollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SystemController {

	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/index.html")
	public ModelAndView indexPage(){
		return new ModelAndView();
	}
	
	@RequestMapping(value="/test.html")
	public ModelAndView testPage(){
		return new ModelAndView();
	}
}
