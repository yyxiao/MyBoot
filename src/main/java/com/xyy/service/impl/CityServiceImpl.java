package com.xyy.service.impl;

import com.xyy.mapper.CityMapper;
import com.xyy.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xyy.service.CityService;

/**
 * CityServiceImpl
 * service.impl
 *
 * @author xiaoyy
 * @Date 2017-05-17 下午3:34
 * The word 'impossible' is not in my dictionary.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public City getCityInfo(String code) {
        City city = cityMapper.findCityInfo(code);
//        City city = new City();
        city.setName("sdfdsf");
        return city != null ? city : new City();
    }
}
