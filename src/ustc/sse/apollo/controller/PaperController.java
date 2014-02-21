package ustc.sse.apollo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ustc.sse.apollo.model.Paper;
import ustc.sse.apollo.service.PaperService;

@Controller
public class PaperController {
	private PaperService paperService;

	public PaperService getPaperService() {
		return paperService;
	}

	@Autowired
	public void setPaperService(PaperService paperService) {
		this.paperService = paperService;
	}
	
	@RequestMapping(value="/exam/listpaper.html")
	public ModelAndView listAllPaper(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("papers", paperService.listAllPaper());
		return mv;
	}
	
	@RequestMapping(value="/exam/findpaper.action")
	public String findPaper(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		
		return "redirect:paperinfo.html?id=" + id;
	}
	
	@RequestMapping(value="/exam/paperinfo.html")
	public ModelAndView findPaperPage(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("paper", paperService.findPaperById(id));
		return mv;
	}
	
	@RequestMapping(value="/exam/editpaper.html")
	public ModelAndView editPaper(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("paper", paperService.findPaperById(id));
		
		mv.addObject("paper", paperService.findPaperById(id));
		return mv;
	}
	
	@RequestMapping(value="/exam/updatepaper.action")
	public String updatePaper(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		
		Paper paper = paperService.findPaperById(id);
		paper.setCourseName(request.getParameter("courseName"));
		paper.setPaperName(request.getParameter("paperName"));
		paper.setPaperValue(Integer.parseInt(request.getParameter("paperValue")));
		
		paperService.updatePaper(paper);
		
		return "redirect:listpaper.html";
	}
	
	@RequestMapping(value="/exam/delpaper.action")
	public String delPaper(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		
		Paper paper = paperService.findPaperById(id);
		paperService.delPaper(paper);
		
		return "redirect:listpaper.html";
	}
	
	@RequestMapping(value="/exam/addpaper.html")
	public ModelAndView addPaperPage(){
		return new ModelAndView();
	}
	
	@RequestMapping(value="/exam/addpaper.action")
	public String addPaper(HttpServletRequest request){
		Paper paper = new Paper();
		paper.setCourseName(request.getParameter("courseName"));
		paper.setPaperName(request.getParameter("paperName"));
		paper.setPaperValue(Integer.parseInt(request.getParameter("paperValue")));
		
		paperService.addPaper(paper);
		return "redirect:listpaper.html";
		
	}
}
