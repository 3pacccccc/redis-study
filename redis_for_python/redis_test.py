# -*- coding: utf-8 -*-
from __future__ import unicode_literals

import redis

client = redis.StrictRedis(host="49.234.18.154", port=6380)

"""
string操作
"""
# key = "hello"
# setResult = client.set(key, "python-redis", ex=20)
# print setResult  # True
# value = client.get(key)
# print value # python-redis

"""
hash操作
"""
# hash_result1 = client.hset("myhash", "f1", "v1")
# hash_result2 = client.hset("myhash", "f2", "v2")
# hash_result3 = client.hset("myhash", "f3", "v3")
# hash_result = client.hgetall("myhash")
# print  # {'f1': 'v1', 'f2': 'v2', 'f3': 'v3'}
# print type(hash_result)  # dict
# print hash_result1  # 1
# print type(hash_result1)  # long
# print hash_result2
# print hash_result3

"""
list操作
"""
# list_result1 = client.lpush("mylist_py", "1")
# list_result2 = client.lpush("mylist_py", "2")
# list_result3 = client.lpush("mylist_py", "3")
# list_result = client.lrange("mylist_py", 0, -1)
# print list_result
# print list_result1
# print list_result2
# print list_result3

"""
set操作
"""
# set_result1 = client.sadd("myset_py", "a")
# set_result2 = client.sadd("myset_py", "b")
# set_result3 = client.sadd("myset_py", "a")
# set_result = client.smembers("myset_py")
# print set_result
# print set_result1
# print set_result2
# print set_result3

"""
zset操作
"""
zset_result1 = client.zadd("myzset_py", "99", 99)
zset_result2 = client.zadd("myzset_py", "66", 66)
zset_result3 = client.zadd("myzset_py", "33", 33)
zset_result = client.zrange("myzset_py", 0, -1, withscores=True)
print zset_result1
print zset_result2
print zset_result3
print zset_result
