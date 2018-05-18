package com.qp.springboot.webservice.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @Author Liubity
 * @Date 2018/5/18
 */
public class FilterTest implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        long startTime = System.currentTimeMillis();

        System.out.println(servletRequest.getLocalAddr());

        filterChain.doFilter( servletRequest,servletResponse );

        System.out.println("历时 ： " + (System.currentTimeMillis() - startTime ));

    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
