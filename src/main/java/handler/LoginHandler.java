package handler;

import org.apache.naming.Constants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import utils.BootConstants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LoginHandler
 * handler
 *
 * @author xiaoyy
 *         登陆拦截器
 * @Date 2017-05-15 下午5:59
 * The word 'impossible' is not in my dictionary.
 */

public class LoginHandler implements HandlerInterceptor {


    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @Description
     * @author Xander
     * @Date 2017/5/15 下午6:01
     * The word 'impossible' is not in my dictionary.
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object obj = httpServletRequest.getSession().getAttribute(BootConstants.LOGIN_USER_INFO);
        String url = httpServletRequest.getRequestURI();
        if (obj == null) {
            // 全局拦截 url，没有登录或者session过期跳转登录页面
            httpServletResponse.sendRedirect("/login.htm");
            return false;
        }else {
            return false;

        }
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
