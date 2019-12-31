package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Campaign;
import br.com.rpg.campaign.model.DungeonMaster;
import br.com.rpg.campaign.model.User;

public class EditCampaign implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : EditCampaign acessado!");

		String campaignName = req.getParameter("name");
		String dungeonMasterID = req.getParameter("dungeonMaster");
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Campaign campaign = new Campaign();
		campaign = campaign.searchCampaignById(id);
		
		User user = new User();
		user = user.searchUserById(Integer.parseInt(dungeonMasterID));
		
		DungeonMaster targetDM = null;
		for (DungeonMaster dm : DungeonMaster.getLista()) {
			if(dm.getUser().getId() == user.getId()) {
				targetDM = dm;
			}
		}

		campaign.setCampaignName(campaignName);
		campaign.setDungeonMaster(targetDM);;

		req.setAttribute("campaign", campaign);

		req.setAttribute("campaignList", Campaign.getLista());
		return "forward:campaignList.jsp";

	}

}
