package com.xyy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LogbackTestController
 * com.xyy.controller
 *
 * @author Xander
 * @Description logback设置测试类
 * @Date 2018-07-15 上午9:21
 * The word 'impossible' is not in my dictionary.
 */

@Controller
public class LogbackTestController {

    private Logger logger = LoggerFactory.getLogger(LogbackTestController.class);


    @RequestMapping(value = "/logbackTest",method = RequestMethod.GET)
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return "abc";
    }


}
