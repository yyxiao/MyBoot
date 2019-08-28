package com.xyy.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * LogHttpAspect
 * com.xyy.aop
 *
 * @author Xander
 * @Description controller层日志拦截器
 * @Date 2019-08-28 10:25
 * The word 'impossible' is not in my dictionary.
 */
@Aspect
@Component
public class LogHttpAspect {
    private Logger logger = LoggerFactory.getLogger(LogHttpAspect.class);

    @Pointcut("execution(public * com.xyy.controller.*.*(..))")
    public void log() {
    }

    private long start;

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        start = System.currentTimeMillis();
        logger.info("请求开始时间api request start " + (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())));
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("请求路径Url={}", request.getRequestURI());
        logger.info("请求方式method={}", request.getMethod());
        logger.info("访问IP={}", request.getRemoteAddr());

        if (joinPoint != null) {
            logger.info("全部请求路径class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            logger.info("请求参数args={}", JSONObject.toJSON(joinPoint.getArgs()));
        }
    }

    //获取接口返回的内容
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturining(Object object) {
        logger.info("请求结束时间api request end " + (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())));
        long end = System.currentTimeMillis();
        logger.info("耗费时间time={}", (end - start) + "ms");
        if (object == null) {
            logger.info("请求返回值returning={}", "");
        } else {
            logger.info("请求返回值returning={}", JSONObject.toJSON(object).toString());
        }
    }

}