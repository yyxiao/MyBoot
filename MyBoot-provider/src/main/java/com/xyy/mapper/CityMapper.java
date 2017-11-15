package com.xyy.mapper;

import com.xyy.model.City;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {

    City findCityInfo(@Param("code") String code);

}