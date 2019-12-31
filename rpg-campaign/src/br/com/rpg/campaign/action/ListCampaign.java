package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Campaign;

public class ListCampaign implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("[ Action ] : ListCampaign acessado!");

		req.setAttribute("campaignList", Campaign.getLista());
		return "forward:campaignList.jsp";

	}

}
