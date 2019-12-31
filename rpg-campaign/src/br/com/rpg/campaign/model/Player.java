package br.com.rpg.campaign.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 
 * The Class Player extends the class User and represents a player. The player
 * have a name and a character. The player is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class Player{

	private List<PlayableCharacter> characterList =  new ArrayList<PlayableCharacter>();
	private User user;
	private static List<Player> lista = new ArrayList<Player>();
	
	public Player() {};

	public Player(User loggedUser) {
		this.user = loggedUser;
		lista.add(this);
	}
	
	public List<PlayableCharacter> getCharacterList() {
		return characterList;
	}
	
	public void createCharacter(String characterName, int points, int strength, int dexterity, int endurance,
			int armor, int firepower, int level, int hitPoints, int magicPoints, Set<String> advantages,
			Set<String> disadvantages, Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		this.characterList.add(new PlayableCharacter(characterName, points, strength, dexterity, endurance, armor, firepower,
				level, hitPoints, magicPoints, advantages, disadvantages, damageTypes, knownSpells, moneyAndItems));

	}
	
	public static List<Player> getLista() {
		return lista;
	}
	
	public User getUser() {
		return user;
	}

}