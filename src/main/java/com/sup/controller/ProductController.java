package com.sup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sup.service.CustomerService;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/product")
@Log
public class ProductController {
	@Autowired
	private CustomerService customerService;
}
