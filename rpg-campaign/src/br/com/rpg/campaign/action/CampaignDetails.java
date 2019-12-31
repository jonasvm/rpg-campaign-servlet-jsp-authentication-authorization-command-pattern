package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Campaign;

public class CampaignDetails implements Action{

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : CampaignDetails acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Campaign campaign = new Campaign();
		Campaign target = campaign.searchCampaignById(id);

		if (target.getCampaignName().isEmpty()) {
			throw new ServletException("[ Error ] : Campanha não encontrada!");
		}

		req.setAttribute("campaign", target);
		return "forward:formShowCampaign.jsp";

	}

}
