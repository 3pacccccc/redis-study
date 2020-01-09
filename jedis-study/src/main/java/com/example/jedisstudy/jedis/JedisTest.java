package com.example.jedisstudy.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("49.234.18.154", 6380);
        // 对string的操作
//        Long result = jedis.incr("counter");
//        String result2 = jedis.set("hello", "world");
//        System.out.println(result);
//        System.out.println(result2);

        //对hash的操作
//        Long hsetResult1 = jedis.hset("myhash", "f1", "v1");
//        Long hsetResult2 = jedis.hset("myhash", "f2", "v2");
//        System.out.println(hsetResult1);
//        System.out.println(hsetResult2);
//        Map<String, String> hashResult = jedis.hgetAll("myhash");
//        String v1 = hashResult.get("f1");
//        System.out.println(hashResult);
//        System.out.println(v1);

        // 对list的操作
//        Long listResult1 = jedis.rpush("mylist", "1");
//        Long listResult2 = jedis.rpush("mylist", "2");
//        Long listResult3 = jedis.rpush("mylist", "3");
//        List<String> listResult = jedis.lrange("mylist", 0, -1);
//        System.out.println(listResult1); //1
//        System.out.println(listResult2); //2
//        System.out.println(listResult3); //3
//        System.out.println(listResult); //[1, 2, 3]

        // 对set的操作
//        Long setResult1 = jedis.sadd("myset", "a");
//        Long setResult2 = jedis.sadd("myset", "b");
//        Long setResult3 = jedis.sadd("myset", "a");
//        Set<String> setResult = jedis.smembers("myset");
//        System.out.println(setResult1); //1
//        System.out.println(setResult2); // 1
//        System.out.println(setResult3); // 0
//        System.out.println(setResult); [b,a]

        // 对zset的操作
//        Long zsetResult1 = jedis.zadd("myzset", 99, "tom");
//        Long zsetResult2 = jedis.zadd("myzset", 66, "peter");
//        Long zsetResult3 = jedis.zadd("myzset", 33, "james");
//        Set<Tuple> zsetResult = jedis.zrangeWithScores("myzset", 0, -1);
//        System.out.println(zsetResult1);
//        System.out.println(zsetResult2);
//        System.out.println(zsetResult3);
//        System.out.println(zsetResult);
//        for (Tuple i : zsetResult){
//            System.out.println(i);
//        }

        // pipeline操作
        for (int i = 0; i < 100; i++) {
            Pipeline pipeline = jedis.pipelined();
            for (int j = i * 100; j < (i + 1) * 100; j++) {
                pipeline.hset("hashkey:" + j, "field" + j, "value" + j);
            }
            pipeline.syncAndReturnAll();
        }
    }
}
