package com.xyy.service.impl;

import com.xyy.entity.SysRoleOperRel;
import com.xyy.service.SysRoleOperRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * SysRoleOperRelServiceImpl
 * com.xyy.service.impl
 *
 * @author Xander
 * @Description
 * @Date 2019-05-20 11:18
 * The word 'impossible' is not in my dictionary.
 */
@Service("sysRoleOperRelService")
public class SysRoleOperRelServiceImpl implements SysRoleOperRelService {
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Override
    public  List<SysRoleOperRel> findAll() {
        String sql = "select * from sys_role_oper_rel";
        List<SysRoleOperRel> sysRoleOperRelList = new ArrayList<>();
        List<Map<String, Object>> list = jdbcTemplate2.queryForList(sql.toString());
        if (null != list && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                SysRoleOperRel sysRoleOperRel = new SysRoleOperRel();
                sysRoleOperRel.setRoleOperId(list.get(i).get("ROLE_OPER_ID").toString());
                sysRoleOperRel.setOperatorId(list.get(i).get("OPERATOR_ID").toString());
                sysRoleOperRel.setRoleId(list.get(i).get("ROLE_ID").toString());
                sysRoleOperRelList.add(sysRoleOperRel);
            }
        }
        return sysRoleOperRelList;
    }
}
