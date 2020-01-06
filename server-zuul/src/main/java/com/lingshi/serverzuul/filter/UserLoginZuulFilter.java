package com.lingshi.serverzuul.filter;

import com.lingshi.serverzuul.util.IPUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: UserLoginZuulFilter
 * @Author:
 * @Create By: chenxihua
 * @Date: 2019/9/28 14:04
 */
@Component
public class UserLoginZuulFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(UserLoginZuulFilter.class);


    @Override
    public boolean shouldFilter() {
        logger.warn("1:   ----------------> ");
        //1 获得工具类（请求上下文）
        RequestContext requestContext = RequestContext.getCurrentContext();
        //2 获得请求对象
        HttpServletRequest request = requestContext.getRequest();
        String requestURI = request.getRequestURI();
        if (requestURI.contains("login")){
            String username = request.getParameter("name");
            String ip = IPUtil.getIpAddrByRequest(request);
            requestContext.addZuulRequestHeader("name", username);
            requestContext.addZuulRequestHeader("clientIP", ip);
            logger.warn("登录不作过滤， username：{}，  ip: {}", username, ip);
            return false;
        }
        // 该过滤器需要执行
        return true;
    }

    /**
     * 编写业务逻辑是
     * @return
     */
    @Override
    public Object run() {
        logger.warn("听说不过滤。。。");
        //1 获得工具类（请求上下文）
        RequestContext requestContext = RequestContext.getCurrentContext();
        //2 获得请求对象
        HttpServletRequest request = requestContext.getRequest();
        //3 获得请求头 ，获得token值
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token)){
            // 过滤该请求，不对其进行路由
            requestContext.setSendZuulResponse(false);
            // 设置响应状态码
            requestContext.setResponseStatusCode(403);
            // 设置响应状态码
            requestContext.setResponseBody("token is empty， 请你先登录系统。");
            return null;
        }

        // 放行
        return null;
    }

    @Override
    public String filterType() {
        // 设置过滤器类型为：pre
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 设置执行顺序为0
        return 0;
    }


}
