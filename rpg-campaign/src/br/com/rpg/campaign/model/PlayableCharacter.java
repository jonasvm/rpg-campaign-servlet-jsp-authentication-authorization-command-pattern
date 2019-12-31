package br.com.rpg.campaign.model;

import java.util.Set;

/**
 * 
 * The Class PlayableCharacter extends the class Character and represents a
 * character owned by a player. It is created and used by the Player, and
 * contains the implementation of super class constructor and abstract methods,
 * and also the methods to increase and decrease the experience points, that are
 * exclusive characteristics of playable character.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public class PlayableCharacter extends Character {

	private int experiencePoints;
	private String backgroundHistory;

	public PlayableCharacter(){}
	
	public PlayableCharacter(String name, int points, int strength, int dexterity, int endurance, int armor,
			int firePower, int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {
		
		super(name, points, strength, dexterity, endurance, armor, firePower, level, hitPoints, magicPoints, advantages,
				disadvantages, damageTypes, knownSpells, moneyAndItems);

	}

	public StringBuilder printSpreadsheat() {

		StringBuilder spreadsheat = new StringBuilder();
		spreadsheat.append("[ Character Spreadsheat ] " + " \n");
		spreadsheat.append("- Name: " + this.getName() + "\n");
		spreadsheat.append("- Points: " + this.getPoints() + "\n");
		spreadsheat.append("- Strength: " + this.getStrength() + "\n");
		spreadsheat.append("- Dexterity: " + this.getDexterity() + "\n");
		spreadsheat.append("- Endurance: " + this.getEndurance() + "\n");
		spreadsheat.append("- Armor: " + this.getArmor() + "\n");
		spreadsheat.append("- Fire Power: " + this.getFirePower() + "\n");
		spreadsheat.append("- Level: " + this.getLevel() + "\n");
		spreadsheat.append("- Hit Points: " + this.getHitPoints() + "\n");
		spreadsheat.append("- Magic Points: " + this.getMagicPoints() + "\n");
		spreadsheat.append("- Advantages: " + this.getAdvantages() + "\n");
		spreadsheat.append("- Disadvantages: " + this.getDisadvantages() + "\n");
		spreadsheat.append("- Damage Types: " + this.getDamageTypes() + "\n");
		spreadsheat.append("- Known Spells: " + this.getKnownSpells() + "\n");
		spreadsheat.append("- Money And Items: " + this.getMoneyAndItems() + "\n");
		spreadsheat.append("- Experience Points: " + this.getExperiencePoints() + "\n");
		spreadsheat.append("- Background History: " + this.getBackgroundHistory());

		return spreadsheat;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void increaseExperiencePoints(int experiencePointsToIncrease) {
		this.experiencePoints += experiencePointsToIncrease;
	}

	public void decreaseExperiencePoints(int experiencePointsToDecrease) {
		this.experiencePoints -= experiencePointsToDecrease;
	}

	public String getBackgroundHistory() {
		return backgroundHistory;
	}
	
	public void setBackgroundHistory(String backgroundHistory) {
		this.backgroundHistory = backgroundHistory;
	}

}
