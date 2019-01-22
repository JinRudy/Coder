package com.jin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.jin.dao.BookMapper;
import com.jin.service.BookBiz;

@Service(version="1.1.1")
public class BookBizImpl implements BookBiz{
	
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Map<String, Object>> findAllBook() {
		return bookMapper.findAllBook();
	}
	
}
