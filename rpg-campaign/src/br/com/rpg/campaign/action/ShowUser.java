package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.User;

public class ShowUser implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : ShowUser acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		User user = new User();
		user = user.searchUserById(id);
		req.setAttribute("user", user);
		return "forward:formEditUser.jsp";

	}

}
