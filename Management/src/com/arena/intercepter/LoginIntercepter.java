package com.arena.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginIntercepter implements HandlerInterceptor{

	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO 自动生成的方法
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO 自动生成的方法
		
	}

	     //进入controller之前执行
		//用于身份认证
		//比如：如果认证表示当前用户没有登陆，则需要此方法拦截不再向下执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO 自动生成的方法
		//首先获取请求的url，是否为公开地址
		String url = request.getRequestURI();
		//实际使用时将其配置在配置文件中，登陆提交的地�?
		if(url.indexOf("login.action")>=0){
			return true;
		}
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		
		if(username!=null)
		{
			//身份存在，放
			return true;
		}
		
		
		//执行到这里表示用户的身份认证,跳转登陆界面
		request.getRequestDispatcher("/login.jsp").forward(request, response);   //转发到new.jsp
		return false;
	}

}
