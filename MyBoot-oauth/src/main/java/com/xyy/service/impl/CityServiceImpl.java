package com.xyy.service.impl;

import com.xyy.dao.CityDao;
import com.xyy.entity.ComplatCity;
import com.xyy.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * CityServiceImpl
 * com.xyy.service.impl
 *
 * @author Xander
 * @Description
 * @Date 2019-04-17 20:18
 * The word 'impossible' is not in my dictionary.
 */
@Transactional
@Service("cityServiceImpl")
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;

    @Override
    public ComplatCity getCity() {
        ComplatCity city = cityDao.findCityByZone("8a929fcc644931a8016449383a340000");
        return city;
    }
}
