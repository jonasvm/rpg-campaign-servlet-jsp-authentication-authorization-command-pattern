package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.DungeonMaster;
import br.com.rpg.campaign.model.User;

public class NewDM implements Action {
	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : NewDM acessado!");

		HttpSession session = req.getSession();
		User newDM = (User) session.getAttribute("loggedUser");

		new DungeonMaster(newDM);

		req.setAttribute("playerList", User.getLista());

		return "forward:playerList.jsp";

	}

}
