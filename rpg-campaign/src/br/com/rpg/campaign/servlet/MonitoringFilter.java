package br.com.rpg.campaign.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//Para cancelar o monitoramento, basta comentar a linha @WebFilter
//@WebFilter(urlPatterns = "/gameplay")
public class MonitoringFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void destroy() {
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		System.out.println("[ Servlet ] : MonitoringFilter acessado!");

		long antes = System.currentTimeMillis();
		
		String action = arg0.getParameter("action");
		
		//executa a ação
		arg2.doFilter(arg0, arg1);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("[ Monitoring ] : Tempo de execução da ação - " + action + " -> " + (depois - antes) + " ms.");

		
	}

}
