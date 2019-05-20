package com.xyy.controller;

import com.xyy.entity.SysRoleOperRel;
import com.xyy.service.SysRoleOperRelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SysRoleOperRelController
 * com.xyy.controller
 *
 * @author Xander
 * @Description
 * @Date 2019-05-20 11:22
 * The word 'impossible' is not in my dictionary.
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleOperRelController {
    @Autowired
    private SysRoleOperRelService sysRoleOperRelService;

    @ApiOperation(value = "获取所有关联信息", notes = "多数据源获取信息demo")
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<SysRoleOperRel> findAll(){
        List<SysRoleOperRel> list = sysRoleOperRelService.findAll();
        return list;
    }
}
