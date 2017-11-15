package com.example.demo.filter;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


//@WebFilter(urlPatterns = "/")
public class TimeFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("SimpleFilter : init");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("before req-processing"); // log , validate , verify session , authentication , auth...
		LocalTime localTime = LocalTime.now();
		if (localTime.getHour() >= 17) {
			HttpServletResponse httpResp = (HttpServletResponse) resp;
			httpResp.sendRedirect("timeUp.html");
			return;
		}
		filterChain.doFilter(req, resp); // delegate
		System.out.println("after req-processing");
	}

	@Override
	public void destroy() {
		System.out.println("SimpleFilter : destroy");
	}

}
