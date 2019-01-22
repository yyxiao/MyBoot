package com.xyy;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * AccessFilter
 * com.xyy
 *
 * @author xiaoyy
 * @Description 设置进入访问过滤器
 * @Date 2017-11-17 上午10:24
 * The word 'impossible' is not in my dictionary.
 */
public class AccessFilter extends ZuulFilter {
    private static Logger logger = Logger.getLogger(ZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }
    @Override
    public int filterOrder() {
        return 0;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        //获取传来的参数accessToken
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            logger.warn("access token is empty");
            //过滤该请求，不往下级服务去转发请求，到此结束
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("{\"result\":\"accessToken为空!\"}");
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
            return null;
        }
        //如果有token，则进行路由转发
        logger.info("access token ok");
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }

}