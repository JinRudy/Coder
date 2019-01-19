package com.jin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jin.dao.BookMapper;

@Controller
public class BookController {

	@Autowired
	private BookMapper bookMapper;
	
	@RequestMapping("/findAllData")
	public ModelAndView findAllData(ModelAndView mv) {
		System.out.println("===============================查询Start=======================================");
		long start = System.currentTimeMillis();
		List<Map<String, Object>> list = bookMapper.findAllBook();
		long end = System.currentTimeMillis();
		System.out.println("===============================查询End=======================================");
		System.out.println("查询时间:End-Start:"+(end-start));
		mv.setViewName("showData");
		mv.addObject("alldata", list);
		return mv;
	};
	
}
