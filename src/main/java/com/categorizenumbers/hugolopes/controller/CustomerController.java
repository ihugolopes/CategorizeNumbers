package com.categorizenumbers.hugolopes.controller;

import com.categorizenumbers.hugolopes.dto.CategorizedDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.categorizenumbers.hugolopes.service.interfaces.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {

	@GetMapping
    public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
	

}
