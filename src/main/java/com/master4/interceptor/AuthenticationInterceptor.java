package com.master4.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import com.master4.entities.User;

public class AuthenticationInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        if (user != null) {
            UserContext.setUserThreadLocal(user);
        }
        return true;
		
	}
	
	

}
