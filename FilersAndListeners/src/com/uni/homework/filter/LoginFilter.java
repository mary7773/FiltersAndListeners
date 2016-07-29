package com.uni.homework.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/Login")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Login filter");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username != null && !username.equals("")) {
			request.setAttribute("username", username);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			//request.getRequestDispatcher("login.jsp").forward(request, response);
			HttpServletResponse httpResponse = (HttpServletResponse)response;
			
			httpResponse.sendRedirect("/FilersAndListeners/login.jsp");
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
