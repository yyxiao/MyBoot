package com.xyy.controller;

import com.xyy.entity.ComplatCity;
import com.xyy.entity.ComplatZone;
import com.xyy.service.CityService;
import com.xyy.service.ComplatZoneService;
import com.xyy.service.RedisService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.jasypt.util.text.BasicTextEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * UserController
 * com.xyy.rest
 *
 * @author Xander
 * @Description cityRestController类
 * @Date 2018-04-09 下午2:32
 * The word 'impossible' is not in my dictionary.
 */

@RestController
public class CityController {
    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private ComplatZoneService complatZoneService;
    @Autowired
    private CityService cityService;
    @Autowired
    private RedisService redisService;

    /**
     * 根据ID查询城市
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取城市详细信息", notes = "根据url的id来获取城市详细信息")
    @ApiImplicitParam(name = "id", value = "城市ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "city/{id}", method = RequestMethod.GET)
    public List<ComplatZone> getUserById(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        List<ComplatZone> r = new ArrayList<ComplatZone>();

        r = complatZoneService.getAll();
        return r;
    }

    /**
     * 根据ID查询城市
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取城市详细信息", notes = "根据url的id来获取城市详细信息")
    @ApiImplicitParam(name = "id", value = "城市ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "citys/{id}", method = RequestMethod.GET)
    public ComplatCity getCityById(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        ComplatCity r = new ComplatCity();
        r = cityService.getCity();
        return r;
    }


    /**
     * @Description 测试redis集成template
     * @author Xander
     * @param id
     * @param val
     * @Date 2019-07-08 14:45
     * @see com.xyy.controller
     * The word 'impossible' is not in my dictionary.
     */
    @ApiOperation(value = "测试redisTemplate", notes = "测试redisTemplate")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "val", value = "值", required = true, dataType = "String", paramType = "query")
    })
    @RequestMapping(value = "setParamsToRedis", method = RequestMethod.GET)
    public String setParamsToRedis(@RequestParam(value = "id")String id,
                                   @RequestParam(value = "val")String val) {
        logger.info("id:" + id);
        logger.info("val:" + val);
        redisTemplate.opsForValue().set(id, val);

        String str = redisTemplate.opsForValue().get(id);
        return str;
    }

    /**
     * 测试redis集成Service
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "测试redis集成", notes = "测试redis集成")
    @ApiImplicitParam(name = "id", value = "随意id", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "redis/{id}", method = RequestMethod.GET)
    public String setRedis(@PathVariable(value = "id") Integer id) {
        System.out.println(id);
        redisService.set("abc", "123333333");
        redisService.set("abcb", "1233333331112333");
        redisService.expire("abcb", Long.parseLong("60"));

        String abc = redisService.get("abc");
        return abc;
    }

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("xander@082445L");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root");
        System.out.println("username:"+username);
        System.out.println("password:"+password);

        System.out.println(textEncryptor.decrypt("Xd+TIlJi2APyeeIJJx7i4g=="));
    }

}
