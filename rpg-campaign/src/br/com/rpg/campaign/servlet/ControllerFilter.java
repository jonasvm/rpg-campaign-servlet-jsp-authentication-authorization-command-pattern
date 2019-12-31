package br.com.rpg.campaign.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;

//@WebFilter("/gameplay")
public class ControllerFilter implements Filter {
	
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
		
		System.out.println("[ Servlet ] : ControllerFilter acessado!");

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String paramAction = req.getParameter("action");
		String location = null;

		try {
			String className = "br.com.rpg.campaign.action." + paramAction;
			Class<?> actionClass = Class.forName(className);
			Object obj = actionClass.newInstance();
			Action action = (Action) obj;
			location = action.executa(req, res);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException("[ Error ] : Erro no filtro de ações" + e);
		}

		System.out.println("[ Servlet ] : Ação " + paramAction + " acessada.");

		// Redirect to JSP
		String[] typeOfRedyrectAndAddress = location.split(":");

		if (typeOfRedyrectAndAddress[0].equals("forward")) {
			System.out.println(
					"[ Controller ] : Redirecionando para " + typeOfRedyrectAndAddress[1] + " com o dispatcher");
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + typeOfRedyrectAndAddress[1]);
			rd.forward(req, res);
		} else {
			System.out.println(
					"[ Controller ] : Redirecionando para " + typeOfRedyrectAndAddress[1] + " com o send redirect");
			res.sendRedirect("WEB-INF/view/" + typeOfRedyrectAndAddress[1]);
		}

//		switch (paramAction) {
//
//		case "ListUser":
//
//			ListUser action = new ListUser();
//			location = action.executa(req, res);
//			break;
//
//		case "NewPlayer":
//			
//			NewPlayer action = new NewPlayer();
//			location = action.executa(req, res);
//			break;
//
//		case "EditPlayer":
//
//			EditPlayer action = new EditPlayer();
//			location = action.executa(req, res);
//			break;
//
//		case "ShowUser":
//			
//			ShowUser action = new ShowUser();
//			location = action.executa(req, res);
//			break;
//
//		case "UserDetails":
//
//			UserDetails action = new UserDetails();
//			location = action.executa(req, res);
//			break;
//
//		case "RemoveUser":
//
//			RemoveUser action = new RemoveUser();
//			location = action.executa(req, res);
//			break;
//
//		case "NewDM":
//
//			NewDM action = new NewDM();
//			location = action.executa(req, res);
//			break;
//
//		case "EditDM":
//
//			EditDM action = new EditDM();
//			location = action.executa(req, res);
//			break;
//
//		case "NewCampaign":
//
//			NewCampaign action = new NewCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "ListCampaign":
//
//			ListCampaign action = new ListCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "CampaignDetails":
//
//			CampaignDetails action = new CampaignDetails();
//			location = action.executa(req, res);
//			break;
//
//		case "ShowCampaign":
//
//			ShowCampaign action = new ShowCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "EditCampaign":
//
//			EditCampaign action = new EditCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "RemoveCampaign":
//
//			RemoveCampaign action = new RemoveCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "UserPage":
//
//			UserPage action = new UserPage();
//			location = action.executa(req, res);
//			break;
//
//		case "CreateDM":
//
//			CreateDM action = new CreateDM();
//			location = action.executa(req, res);
//			break;
//
//		case "CreatePlayer":
//
//			CreatePlayer action = new CreatePlayer();
//			location = action.executa(req, res);
//			break;
//
//		case "CampaignPage":
//
//			CampaignPage action = new CampaignPage();
//			location = action.executa(req, res);
//			break;
//
//		case "CreateCampaign":
//
//			CreateCampaign action = new CreateCampaign();
//			location = action.executa(req, res);
//			break;
//
//		case "NewUser":
//
//			NewUser action = NewUser();
//			location = action.executa(req, res);
//			break;
//
//		case "CreateUser":
//
//			CreateUser action = new CreateUser();
//			location = action.executa(req, res);
//			break;
//
//		case "LoginForm":
//
//			LoginForm action = new LoginForm();
//			location = action.executa(req, res);
//			break;
//
//		case "DoLogin":
//
//			DoLogin action = new DoLogin();
//			location = action.executa(req, res);
//			break;
//
//		case "DoLogout":
//
//			DoLogout action = new DoLogout();
//			location = action.executa(req, res);
//			break;
//
//		default:
//			break;
//		}

	}

}
