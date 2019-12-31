package br.com.rpg.campaign.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The Class Dungeon Master extends the class User and represents a dungeon
 * master. The dungeon master contains a name and is associated with a campaign.
 * 
 * @author jonas
 * @since 02/10/2019
 * @version 1.4
 *
 */
public class DungeonMaster {
	
	private User user;
	private static List<DungeonMaster> lista = new ArrayList<DungeonMaster>();

	public DungeonMaster() {}
	
	public DungeonMaster(User newDM) {
		this.user = newDM;
		lista.add(this);
	}
	
	public static List<DungeonMaster> getLista() {
		return lista;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

}
