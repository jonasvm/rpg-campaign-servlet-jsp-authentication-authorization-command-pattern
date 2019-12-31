package br.com.rpg.campaign.action;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.PlayableCharacter;
import br.com.rpg.campaign.model.Player;
import br.com.rpg.campaign.model.User;

public class UserDetails implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : UserDetails acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		User user = new User();
		user = user.searchUserById(id);
		
		Set<PlayableCharacter> characterList = new HashSet<PlayableCharacter>();
		for (Player player : Player.getLista()) {
			if(user.getId() == player.getUser().getId()) {
				characterList.addAll(player.getCharacterList());
			}
		}
		
		req.setAttribute("listOfCharacters", characterList);
		req.setAttribute("user", user);
		return "forward:formUserDetails.jsp";

	}

}
