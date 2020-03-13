package com.jza.jzaredistest;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisStringCommands;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.types.Expiration;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class JzaRedistestApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testSet() {
        stringRedisTemplate.opsForValue().set("test-string-value","hhhhh");
        System.out.println("aaa");
    }

    @Test
    public void testGet(){
        System.out.println(stringRedisTemplate.opsForValue().get("test-string-value"));
    }

    @Test
    public void testSetTimeOut(){
        stringRedisTemplate.opsForValue().set("test-string-key-time-out","Hello Redis",5, TimeUnit.SECONDS);
    }
    @Test
    public void testLeftPush(){
        List<String> list = new ArrayList<>();
        list.add("j1");
        list.add("j2");
        list.add("j3");
        redisTemplate.opsForList().leftPush("TestList", list);
    }
    @Test
    public void testRightPush(){
        redisTemplate.opsForList().rightPush("TestList","TestRightPush");
    }
    @Test
    public void testLeftPop() {
        Object leftFirstElement = redisTemplate.opsForList().leftPop("TestList");
        System.out.println(leftFirstElement);
    }
    @Test
    public void testRightPop() {
        Object rightFirstElement = redisTemplate.opsForList().rightPop("TestList");
        System.out.println(rightFirstElement);
    }
    @Test
    public void testPut(){
        redisTemplate.opsForHash().put("TestHash","FirstElement", "Hello,Redis hash.");

    }
    @Test
    public void testAdd(){
        redisTemplate.opsForSet().add("TestSet","e1","e2","e3");
    }

    @Test
    public void testGetSet(){

        Set testSet = redisTemplate.opsForSet().members("TestSet");
        System.out.println(testSet);
    }

    @Test
    public void testRemove(){
        redisTemplate.opsForSet().remove("TestSet","e1","e2");
        Set testSet = redisTemplate.opsForSet().members("TestSet");
        System.out.println(testSet.toArray()[0]);

    }
}
