package org.spring.boot.cloud.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author gushu
 * @date 2018/04/19
 */
public class MyFilter implements javax.servlet.Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.err.println("before filter");
		chain.doFilter(request, response);
		System.err.println("after filter");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
