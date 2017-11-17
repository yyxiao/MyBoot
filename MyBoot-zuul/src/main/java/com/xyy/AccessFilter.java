package com.xyy;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

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

        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {

            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return 1;
        }
        return null;
    }

}