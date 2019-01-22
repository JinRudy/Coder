package com.jin.controller;

import java.util.List;
import java.util.Map;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jin.dao.BookMapper;
import com.jin.service.BookBiz;
import com.jin.service.impl.BookBizImpl;

@Controller
public class BookController {

	@Reference(version="1.1.1",timeout=1000000)
	private BookBiz bookBiz;
	
	@RequestMapping("/findAllData")
	public ModelAndView findAllData(ModelAndView mv) {
		System.out.println("===============================查询Start=======================================");
		long start = System.currentTimeMillis();
		List<Map<String, Object>> list = bookBiz.findAllBook();
		System.out.println(list.toString());
		long end = System.currentTimeMillis();
		System.out.println("===============================查询End=======================================");
		System.out.println("查询时间:End-Start:"+(end-start));
		mv.setViewName("showData");
		mv.addObject("alldata", list);
		return mv;
	};
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "sessuce";
	}
	
}
