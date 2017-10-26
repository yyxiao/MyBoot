package com.xyy.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * HelloController
 * com.xyy.controller
 *
 * @author xiaoyy
 * 登陆页
 * @Date 2017-05-30 上午9:24
 * The word 'impossible' is not in my dictionary.
 */
@Controller
public class HelloController {
    private Logger logger = Logger.getLogger(HelloController.class);

    /*
    *   http://localhost:8080/hello?name=test
     */

    @RequestMapping("/hello")
    public String greeting(Map<String,Object> map) {
        logger.info("hello");
        map.put("hello","from TemplateController.test");
        // 返回templates中test.html
        return "test";
    }
}
