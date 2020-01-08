package com.example.jedisstudy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisStudyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void jedisTest() {
        Jedis jedis = new Jedis("49.234.18.154", 6380);
        jedis.incr("counter");
    }

}
