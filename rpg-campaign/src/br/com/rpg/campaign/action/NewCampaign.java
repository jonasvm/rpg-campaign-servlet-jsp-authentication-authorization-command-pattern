package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Campaign;
import br.com.rpg.campaign.model.DungeonMaster;
import br.com.rpg.campaign.model.User;

public class NewCampaign implements Action {

	private Campaign campaign;

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("[ Action ] : NewCampaign acessado!");

		String campaignName = req.getParameter("name");
		String dungeonMasterID = req.getParameter("dungeonMaster");

		User user = new User();
		user = user.searchUserById(Integer.parseInt(dungeonMasterID));
		
		DungeonMaster targetDM = null;
		for (DungeonMaster dm : DungeonMaster.getLista()) {
			if(dm.getUser().getId() == user.getId()) {
				targetDM = dm;
			}
		}

		Campaign c = new Campaign(targetDM, campaignName);
		setCampaign(c);

		req.setAttribute("campaignList", Campaign.getLista());
		return "forward:campaignList.jsp";

	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
