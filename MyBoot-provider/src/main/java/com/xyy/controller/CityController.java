package com.xyy.controller;

import com.xyy.model.City;
import com.xyy.service.CityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * CityController
 * controller
 *
 * @author xiaoyy
 * CityController
 * @Date 2017-05-17 下午3:06
 * The word 'impossible' is not in my dictionary.
 */
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    private Logger logger = Logger.getLogger(CityController.class);

    @RequestMapping("/getCityInfo")
    @ResponseBody
    public City getCityInfo(String code) {
        City city = cityService.getCityInfo(code);
        if(city!=null){
            System.out.println("user.getName():"+city.getName());
            logger.info("user.getCode():"+city.getCode());
        }
        return city;
    }

}
