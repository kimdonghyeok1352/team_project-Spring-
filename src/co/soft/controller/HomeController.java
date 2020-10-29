package co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.soft.beans.ContentBean;
import co.soft.mapper.BoardMapper;
import co.soft.service.BoardService;
@Controller
public class HomeController {
	@Autowired
	BoardService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("home");
		
		return "index";
	}
	@GetMapping("/booking")
	public String booking(@ModelAttribute ContentBean cb,Model model) {
		
		ContentBean result = service.main1(cb);
		model.addAttribute("result",result);
		
		return "bookingcomplete";
	}
	
}
