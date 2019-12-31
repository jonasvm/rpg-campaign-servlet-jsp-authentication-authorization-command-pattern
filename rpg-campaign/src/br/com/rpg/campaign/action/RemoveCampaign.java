package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Campaign;

public class RemoveCampaign implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : RemoveCampaign acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Campaign campaign = new Campaign();

		req.setAttribute("campaignList", Campaign.getLista());

		String location = null;
		if (campaign.removeCampaign(id)) {
			location = "forward:campaignList.jsp";
		}

		return location;

	}

}
