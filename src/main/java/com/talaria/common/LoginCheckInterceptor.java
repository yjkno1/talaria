package com.talaria.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HttpSession session  = request.getSession(false);

		/*
		if(session == null){
			response.sendRedirect(request.getContextPath()+"/login/login");
			return false;
		}
		String userId = (String)session.getAttribute("userId");
		if(userId == null){
			response.sendRedirect(request.getContextPath()+"/login/login");
			return false;
		}
		 */

		return true;
	}
}
