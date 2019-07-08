package com.xyy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * SessionController
 * com.xyy.controller
 *
 * @author Xander
 * @Description
 * @Date 2018-07-20 下午4:49
 * The word 'impossible' is not in my dictionary.
 */
@Controller
@RequestMapping("/")
public class SessionController {
    private static final Logger logger = LoggerFactory.getLogger(SessionController.class);

    @RequestMapping(value = "/getSessionId")
    @ResponseBody
    public String getSessionId(HttpServletRequest request) {

        Object o = request.getSession().getAttribute("springboot");
        if (o == null) {
            o = "spring boot 牛逼了!!!有端口" + request.getLocalPort() + "生成";
            request.getSession().setAttribute("springboot", o);
        }

        return "端口=" + request.getLocalPort() + " sessionId=" + request.getSession().getId() + "<br/>" + o;
    }


    @RequestMapping(value = "/setSessionId")
    @ResponseBody
    public String setSessionId(HttpServletRequest request) {
        Object o = "spring boot 牛逼了!!!有端口" + request.getLocalPort() + "生成";
        request.getSession().setAttribute("springboot", o);
        return "端口=" + request.getLocalPort() + " sessionId=" + request.getSession().getId() + "<br/>" + o;
    }

}
