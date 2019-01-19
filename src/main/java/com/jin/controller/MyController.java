package com.jin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello linux
 * @author Mr.Wang
 *
 */
@Controller
public class MyController {
	
	@RequestMapping("/helloLinux")
	public String helloLinux() {
		return "hello";	
	}
	
}
