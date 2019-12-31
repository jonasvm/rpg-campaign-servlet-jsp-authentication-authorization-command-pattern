package br.com.rpg.campaign.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.interfaces.Action;
import br.com.rpg.campaign.model.Character;
import br.com.rpg.campaign.model.PlayableCharacter;
import br.com.rpg.campaign.model.User;

public class CharacterDetails implements Action {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		System.out.println("[ Action ] : CharacterDetails acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		User user = new User();
		user = user.searchUserById(id);
		
		String paramCharacterId = req.getParameter("character");
		Integer characterId = Integer.valueOf(paramCharacterId);

		Character character = new PlayableCharacter();
		character = character.searchCharacterById(characterId);
		
		req.setAttribute("user", user);
		req.setAttribute("character", character);
		return "forward:formPlayerDetails.jsp";

	}

}
