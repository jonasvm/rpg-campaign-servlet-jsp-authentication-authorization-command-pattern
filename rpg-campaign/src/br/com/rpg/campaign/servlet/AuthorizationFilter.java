package br.com.rpg.campaign.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/gameplay")
public class AuthorizationFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void destroy() {
		Filter.super.destroy();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("[ Servlet ] : AuthorizationFilter acessado!");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String paramAction = req.getParameter("action");

		HttpSession session = req.getSession();
		boolean userNotLogged = session.getAttribute("loggedUser") == null;
		boolean protectedAction = !paramAction.equals("NewUser") && !paramAction.equals("CreateUser")
				&& !paramAction.equals("LoginForm") && !paramAction.equals("DoLogin");

		if (protectedAction && userNotLogged) {
			res.sendRedirect("loginRequired.html");
			System.out.println("[ Error ] : usuário não conseguiu acessar conteúdo protegido.");
			return;
		}

		chain.doFilter(request, response);
	}

}
