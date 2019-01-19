package com.jin.util;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * @author TeacherChen
 * @description 创建中间类RedisCacheTransfer，完成RedisCache.jedisConnectionFactory的静态注入
 * 2019年1月19日 17点12分
 */
public class RedisCacheTransfer {
	public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
	       RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
	    }

}
