package com.xyy.dao;

import com.xyy.entity.ComplatZone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * ComplatZoneDao
 * com.gsww.dao
 *
 * @author Xander
 * @Description
 * @Date 2018-07-19 下午4:41
 * The word 'impossible' is not in my dictionary.
 */
public interface ComplatZoneDao extends PagingAndSortingRepository<ComplatZone, String>, JpaSpecificationExecutor<ComplatZone>{

}