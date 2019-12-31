package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.DungeonMaster;

public class CreateCampaign implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : CreateCampaign acessado!");

		req.setAttribute("dmList", DungeonMaster.getLista());
		
		String location = "forward:formNewCampaign.jsp";
		return location;

	}

}
