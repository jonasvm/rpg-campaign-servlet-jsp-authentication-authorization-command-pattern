package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.User;

public class RemoveUser implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : RemoveUser acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		User user = new User();

		req.setAttribute("playerList", User.getLista());
		
		HttpSession session = req.getSession();
		User userCompare = (User) session.getAttribute("loggedUser");
		if(userCompare.getId() == id ) {
			session.invalidate();
			System.out.println("[ Action ] : RemoveUser acessado - removendo usuário da sessão e deslogando usuário logado!");
			return "forward:logout.html";
		}

		String location = null;
		if (user.removeUser(id)) {
			location = "forward:playerList.jsp";
		}

		return location;

	}

}
