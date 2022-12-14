package com.hitech.bookshare;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    private StringRedisTemplate  redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("mykey","123456");
    }

}
