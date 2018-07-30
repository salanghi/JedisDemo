package com.helx.demo;

import redis.clients.jedis.Jedis;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Jedis jedis1 = new Jedis("180.76.146.201",6379);
		Jedis jedis2 = new Jedis("180.76.146.201",6380);
		jedis2.slaveof("180.76.146.201",6379);
		jedis1.set("key", "ºÎÁ¢ÐÂ");
		Thread.sleep(2000);
		System.out.println(jedis2.get("key"));
		
//		System.out.println(jedis.ping());
		
//		Set<String> keys = jedis.keys("*");
//		System.out.println(keys.size());
//		for(String key:keys){
//			System.out.println(key);
//		}
	}
}
