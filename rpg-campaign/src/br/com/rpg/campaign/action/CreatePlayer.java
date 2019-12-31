package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;

public class CreatePlayer implements Action {
	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		System.out.println("[ Action ] : CreatePlayer acessado!");
		
		String location = "forward:formNewPlayer.jsp";
		return location;
		
	}

}
