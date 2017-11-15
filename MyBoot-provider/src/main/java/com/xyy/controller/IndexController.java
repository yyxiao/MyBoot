package com.xyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 * com.xyy.controller
 *
 * index
 * @author xiaoyy
 * @Date 2017-10-26 上午10:06
 * The word 'impossible' is not in my dictionary.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("host", "www.jianshu.com");
        return "index";
    }
}
