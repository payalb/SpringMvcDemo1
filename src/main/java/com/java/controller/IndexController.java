package com.java.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//set the data and return view name
public class IndexController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv= new ModelAndView();
		mv.addObject("message", "Hello from controller");
		mv.addObject("date", LocalDateTime.now());
		mv.setViewName("index");
		return mv;
	}

}
