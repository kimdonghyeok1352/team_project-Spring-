package co.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.soft.beans.ContentBean;
import co.soft.mapper.BoardMapper;
@Controller
public class HomeController {
	@Autowired
	BoardMapper map ;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	@GetMapping("/booking")
	public String booking(ContentBean writeContentBean) {
		map.addContentInfo(writeContentBean);
		return "booking";
	}
	
}
