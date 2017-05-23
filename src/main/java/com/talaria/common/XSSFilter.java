package com.talaria.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


/**
 * XSSFilter.java
 * @author    : park hak shin
 * @date    : 2015. 4. 1.
 * @brief   : XSSFilter
 * @description  :  파라미터형태로 유저가 입력한 값들을 체크하여 특수문자 및 서버에 악영향을 미치는 데이터를 체크.

 *
 */
public class XSSFilter implements Filter {

	/** The filter config. */
	private FilterConfig filterConfig;


	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		if(this.filterConfig != null)
			this.filterConfig = null;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		filterChain.doFilter(new XSSFilterRequestWrapper((HttpServletRequest)request), response); // filtering
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

}
