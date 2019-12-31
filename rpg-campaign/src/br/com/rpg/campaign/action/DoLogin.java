package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.User;

public class DoLogin implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : DoLogin acessado!");

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		User user = new User();
		user = user.exist(email, password);

		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("loggedUser", user);
			return "forward:welcome.jsp";
		} else {
			return "forward:loginFail.jsp";
		}

	}

}
