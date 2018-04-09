package com.xyy.rest;

import com.xyy.model.City;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    /**
     * 根据ID查询城市
     * @param id
     * @return
     */
    @ApiOperation(value="获取城市详细信息", notes="根据url的id来获取城市详细信息")
    @ApiImplicitParam(name = "id", value = "城市ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "city/{id}", method = RequestMethod.GET)
    public List<City> getUserById (@PathVariable(value = "id") Integer id){
        System.out.println(id);
        List<City> r = new ArrayList<City>();
        r.add(new City(id.toString(),"b"));
        return r;
    }

}
