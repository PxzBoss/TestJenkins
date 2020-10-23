package com.pxz.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 针对http host 头攻击漏洞 设置host访问白名单
 *
 * @author PXZ
 * @Title: HostCleanFilter
 * @ProjectName HSApp_Mobile
 * @date 2020/6/19 14:56
 */
@Component
public class CleanFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CleanFilter_init_2");

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        System.out.println("CleanFilter_doFilter_2");
       /* if (1 != 0) {
            response.setStatus(403);
            return;
        }*/
        filterChain.doFilter(request, response);

    }


    @Override
    public void destroy() {
        System.out.println("CleanFilter_destroy_2");

    }
}
