package com.solo.quiz.lol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lol")
public class LOLController {
	
	@Autowired
	LOLService lolService;

	@RequestMapping("items")
	public ModelAndView items() {		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/games/imgquiz");
		mv.addObject("list", lolService.getItems());
		return mv;
	}
	
}
