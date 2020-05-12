package com.master4.interceptor;

import com.master4.entities.User;

public class UserContext {
	
	  private static final ThreadLocal<User> USER_THREAD_LOCAL = new ThreadLocal<>();

	    public static void setUserThreadLocal(User user) {
	        USER_THREAD_LOCAL.set(user);
	    }

	    public static void removeUserThreadLocal() {
	        USER_THREAD_LOCAL.remove();
	    }

	    public static User getUserThreadLocal() {
	        return USER_THREAD_LOCAL.get();
	    }

}
