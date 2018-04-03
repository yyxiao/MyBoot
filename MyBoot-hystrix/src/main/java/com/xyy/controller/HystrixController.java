package com.xyy.controller;

import com.xyy.service.CallDependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HystrixController
 * com.xyy.controller
 *
 * @author Xander
 * 测试断路器Controller
 * @Date 2018-04-03 下午2:34
 * The word 'impossible' is not in my dictionary.
 */
@RestController
public class HystrixController {

    @Autowired
    private CallDependencyService callDependencyService;
    /**
     * 调用依赖的服务
     */
    @RequestMapping("/call")
    public String callDependencyService(){
        return callDependencyService.mockGetUserInfo();
    }
}
