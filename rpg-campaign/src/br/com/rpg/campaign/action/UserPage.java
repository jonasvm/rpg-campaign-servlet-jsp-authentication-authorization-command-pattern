package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;

public class UserPage implements Action {
	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		System.out.println("[ Action ] : UserPage acessado!");
		
		String location = "forward:user.jsp";
		return location;
		
	}

}
