package com.xyy.dao;

import com.xyy.entity.ComplatCity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * CityDao
 * com.gsww.dao
 *
 * @author Xander
 * @Description
 * @Date 2019年04月17日20:11:46
 * The word 'impossible' is not in my dictionary.
 */
public interface CityDao extends PagingAndSortingRepository<ComplatCity, String>, JpaSpecificationExecutor<ComplatCity>{

    //注解nativeQuery=true 为原生sql
    @Query(nativeQuery = true,value = "Select t.* from complat_city t,complat_zone z Where t.other=z.iid and t.id = ?1")
    public ComplatCity findCityByZone(String projectId);

}
