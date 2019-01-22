package com.jin.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Mapper
@Component
public interface BookMapper {
	
	List<Map<String,Object>> findAllBook();
	
}
