package com.xyy.controller;

import com.xyy.entity.ComplatZone;
import com.xyy.service.ComplatZoneService;
import com.xyy.service.RedisService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private ComplatZoneService complatZoneService;

    @Autowired
    private RedisService redisService;

    /**
     * 根据ID查询城市
     * @param id
     * @return
     */
    @ApiOperation(value="获取城市详细信息", notes="根据url的id来获取城市详细信息")
    @ApiImplicitParam(name = "id", value = "城市ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "city/{id}", method = RequestMethod.GET)
    public List<ComplatZone> getUserById (@PathVariable(value = "id") Integer id){
        System.out.println(id);
        List<ComplatZone> r = new ArrayList<ComplatZone>();

        r = complatZoneService.getAll();
        return r;
    }

    /**
     * 测试redis集成
     * @param id
     * @return
     */
    @ApiOperation(value="测试redis集成", notes="测试redis集成")
    @ApiImplicitParam(name = "id", value = "随意id", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "redis/{id}", method = RequestMethod.GET)
    public String setRedis (@PathVariable(value = "id") Integer id){
        System.out.println(id);
        redisService.set("abc", "123333333");
        redisService.set("abcb", "1233333331112333");
        redisService.expire("abcb", Long.parseLong("60"));

        String abc = redisService.get("abc");
        return abc;
    }

}
