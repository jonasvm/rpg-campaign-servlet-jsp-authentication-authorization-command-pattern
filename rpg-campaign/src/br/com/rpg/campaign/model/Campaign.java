package br.com.rpg.campaign.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * The Class Campaign represents a campaign. The campaign contains a name, a
 * dungeon master, a list of players and a list of non playable characters. The
 * campaign is the association of all elements necessary to start a game. The
 * responsibility of this class is to hold the updated list of characters and
 * non playable characters, that are the references to update the characters and
 * non playable characters statistics.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public class Campaign {

	private Integer id;
	private static Integer sequence = 1;
	private String campaignName;
	private DungeonMaster dungeonMaster;
	private List<NonPlayableCharacter> nonPlayableCharacterList = new ArrayList<NonPlayableCharacter>();
	private List<Player> playerList = new ArrayList<Player>();
	private Date creationDate;
	private static List<Campaign> lista = new ArrayList<Campaign>();

	public Campaign() {
	}

	public Campaign(DungeonMaster dungeonMaster, String campaignName) {
		this.id = sequence++;
		this.campaignName = campaignName;
		this.dungeonMaster = dungeonMaster;
		this.creationDate = new Date();
		lista.add(this);
	}

	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public DungeonMaster getDungeonMaster() {
		return dungeonMaster;
	}
	
	public void setDungeonMaster(DungeonMaster dungeonMaster) {
		this.dungeonMaster = dungeonMaster;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}
	
	public void setNonPlayableCharacterList(List<NonPlayableCharacter> nonPlayableCharacterList) {
		this.nonPlayableCharacterList = nonPlayableCharacterList;
	}
	
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public List<NonPlayableCharacter> getNonPlayableCharacterList() {
		return nonPlayableCharacterList;
	}

	public void populateNpcList(String characterName, int points, int strength, int dexterity, int endurance, int armor,
			int firepower, int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		nonPlayableCharacterList.add(
				new NonPlayableCharacter(characterName, points, strength, dexterity, endurance, armor, firepower, level,
						hitPoints, magicPoints, advantages, disadvantages, damageTypes, knownSpells, moneyAndItems));

	}

	public void populatePlayerList(Player player) {
		playerList.add(player);
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public static List<Campaign> getLista() {
		return lista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean removeCampaign(Integer id) {
		Iterator<Campaign> it = lista.iterator();

		while (it.hasNext()) {
			Campaign campaign = it.next();
			if (campaign.getId() == id) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public Campaign searchCampaignById(Integer id) {

		for (Campaign campaign : lista) {
			if(campaign.getId() == id) {
				return campaign;
			}
		}
		return null;
	}

}
