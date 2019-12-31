package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.User;

public class NewUser implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : NewUser acessado!");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println("[ Log ] : Cadastrando novo usuário - " + name + " - " + email);

		new User(name, email, password);

		req.setAttribute("playerList", User.getLista());

		return "forward:newUserSuccess.jsp";

	}

}
