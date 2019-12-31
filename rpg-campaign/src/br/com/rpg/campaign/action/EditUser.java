package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.User;

public class EditUser implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : EditUser acessado!");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		User user = new User();
		user = user.searchUserById(id);

		user.setUsername(name);
		user.setEmail(email);
		user.setPassword(password);

		req.setAttribute("playerList", User.getLista());

		return "forward:playerList.jsp";

	}

}
