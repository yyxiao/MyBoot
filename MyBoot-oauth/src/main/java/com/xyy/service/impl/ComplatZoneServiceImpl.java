package com.xyy.service.impl;

import com.xyy.dao.ComplatZoneDao;
import com.xyy.entity.ComplatZone;
import com.xyy.service.ComplatZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ComplatZoneServiceImpl
 * com.gsww.service.impl
 *
 * @author Xander
 * @Description
 * @Date 2018-07-19 下午4:44
 * The word 'impossible' is not in my dictionary.
 */
@Transactional
@Service("complatZoneService")
public class ComplatZoneServiceImpl implements ComplatZoneService {

    @Autowired
    private ComplatZoneDao complatZoneDao;

    @Override
    public List<ComplatZone> getAll() {
        List<ComplatZone> complatZoneList = new ArrayList<ComplatZone>();
        Iterable<ComplatZone> complatZoneIterables = complatZoneDao.findAll();
        Iterator<ComplatZone> complatZoneIterable = complatZoneIterables.iterator();
        while (complatZoneIterable.hasNext()) {
            ComplatZone complatZone = (ComplatZone) complatZoneIterable.next();
            complatZoneList.add(complatZone);
        }
        return complatZoneList;
    }
}
