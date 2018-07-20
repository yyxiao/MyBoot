package com.xyy.service;

import java.util.List;

/**
 * RedisService
 * com.xyy.service
 *
 * @author Xander
 * @Description
 * @Date 2018-07-20 上午9:29
 * The word 'impossible' is not in my dictionary.
 */
public interface RedisService {
    boolean set(String key, String value);

    String get(String key);

    boolean expire(String key, long expire);

    <T> boolean setList(String key, List<T> list);

    long lpush(String key, Object obj);

    long rpush(String key, Object obj);

    String lpop(String key);
}
