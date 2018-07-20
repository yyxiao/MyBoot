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
    /**
     * 保存键key，值value的数据
     * @param key
     * @param value
     * @return
     */
    boolean set(String key, String value);

    /**
     * 根据键获取Redis中的值
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设定键的过期时间
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key, long expire);

    <T> boolean setList(String key, List<T> list);

    /**
     * 在key对应list的头部添加字符串元素
     * @param key
     * @param obj
     * @return
     */
    long lpush(String key, Object obj);

    /**
     * 在key对应list的尾部添加字符串元素
     * @param key
     * @param obj
     * @return
     */
    long rpush(String key, Object obj);

    /**
     * 移除并返回列表key的头元素
     * @param key
     * @return
     */
    String lpop(String key);
}
