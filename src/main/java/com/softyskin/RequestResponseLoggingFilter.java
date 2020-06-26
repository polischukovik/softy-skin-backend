package com.softyskin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;

@Order(2)
public class RequestResponseLoggingFilter implements Filter {

	private final static Logger LOG = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG.info("Initializing filter :{}", this);
	}

	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		LOG.info("Request >> {} : {}", req.getMethod(), req.getRequestURI());
		chain.doFilter(request, response);
		LOG.info("Response << {}, {}", HttpStatus.valueOf(res.getStatus()), res.getContentType());
	}

	@Override
	public void destroy() {
		LOG.warn("Destructing filter :{}", this);
	}
}