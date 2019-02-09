package cn.myblogs.controller.frontcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontPageController {
	@RequestMapping("/index")
	public String index(){
		return "/frontjsp/index";
	}
	@RequestMapping("/about")
	public String about(){
		return "/frontjsp/about";
	}
	@RequestMapping("/skilllist")
	public String getskilllist(){
		return "/frontjsp/skilllist";
	}
	@RequestMapping(value="/getTakenotes")
	public String getTakenotes(Model model){
		model.addAttribute("cId", 1);
		return "/frontjsp/classifyarticlelist";
	}
	@RequestMapping(value="/getCSS3Html5")
	public String getCSS3Html5(Model model){
		model.addAttribute("cId", 2);
		return "/frontjsp/classifyarticlelist";
	}
	@RequestMapping(value="/getWebprogramming")
	public String getWebprogramming(Model model){
		model.addAttribute("cId", 3);
		return "/frontjsp/classifyarticlelist";
	}
	@RequestMapping(value="/getMysqloperation")
	public String getMysqloperation(Model model){
		model.addAttribute("cId", 4);
		return "/frontjsp/classifyarticlelist";
	}
	@RequestMapping("/liftlist")
	public String getliftlist(){
		return "/frontjsp/liftlist";
	}
	@RequestMapping(value="/getLiferecord")
	public String getLiferecord(Model model){
		model.addAttribute("cId", 5);
		return "/frontjsp/classifyarticlelift";
	}
	@RequestMapping(value="/getEnjoyreading")
	public String getEnjoyreading(Model model){
		model.addAttribute("cId", 6);
		return "/frontjsp/classifyarticlelift";
	}
	@RequestMapping(value="/getProgrammedlife")
	public String getProgrammedlife(Model model){
		model.addAttribute("cId", 7);
		return "/frontjsp/classifyarticlelift";
	}
	@RequestMapping(value="/getClassicquotations")
	public String getClassicquotations(Model model){
		model.addAttribute("cId", 8);
		return "/frontjsp/classifyarticlelift";
	}
	@RequestMapping("/sendword")
	public String getsendwordlist(){
		return "/frontjsp/sendword";
	}
	@RequestMapping("/sendwording")
	public String addsendwording(){
		return "/frontjsp/sendwording";
	}
	@RequestMapping("/time")
	public String gettimes(){
		return "/frontjsp/time";
	}
	@RequestMapping("/gbook")
	public String getgbook(){
		return "/frontjsp/gbook";
	}
}
