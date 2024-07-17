package in.gourav.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView(); 
		mav.addObject("msg" ,"Welcome ddd to GG world");
		mav.setViewName("message");
		return mav;
		
	}
	@GetMapping ("/Greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView(); 
		mav.addObject("msg" ,"Good Even");
		mav.setViewName("message");
		return mav;
	}			
}
