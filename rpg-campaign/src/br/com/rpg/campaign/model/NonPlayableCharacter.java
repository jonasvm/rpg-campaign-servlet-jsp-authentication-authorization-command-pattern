package br.com.rpg.campaign.model;

import java.util.Set;

/**
 * 
 * The Class NonPlayableCharacter extends the class Character and represents a
 * character owned by a campaign. It is used by the Campaign, and contains only
 * the implementation of super class constructor and abstract methods. Every
 * NonPlayableCharacter is associated with a campaign (i.e. npcs and monsters).
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public class NonPlayableCharacter extends Character {

	public NonPlayableCharacter(String name, int points, int strength, int dexterity, int endurance, int armor,
			int firePower, int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		super(name, points, strength, dexterity, endurance, armor, firePower, level, hitPoints, magicPoints, advantages,
				disadvantages, damageTypes, knownSpells, moneyAndItems);

	}

	public StringBuilder printSpreadsheat() {

		StringBuilder spreadsheat = new StringBuilder();
		spreadsheat.append("[ NPC Spreadsheat ] " + " \n");
		spreadsheat.append("- Name: " + this.getName() + "\n");
		spreadsheat.append("- Points: " + this.getPoints() + "\n");
		spreadsheat.append("- Strength: " + this.getStrength() + "\n");
		spreadsheat.append("- Dexterity: " + this.getDexterity() + "\n");
		spreadsheat.append("- Endurance: " + this.getEndurance() + "\n");
		spreadsheat.append("- Armor: " + this.getArmor() + "\n");
		spreadsheat.append("- Fire Power: " + this.getFirePower() + "\n");
		spreadsheat.append("- Level: " + this.getLevel() + "\n");
		spreadsheat.append("- Hit Points: " + this.getHitPoints());
		spreadsheat.append("- Magic Points: " + this.getMagicPoints() + "\n");
		spreadsheat.append("- Advantages: " + this.getAdvantages() + "\n");
		spreadsheat.append("- Disadvantages: " + this.getDisadvantages() + "\n");
		spreadsheat.append("- Damage Types: " + this.getDamageTypes() + "\n");
		spreadsheat.append("- Known Spells: " + this.getKnownSpells() + "\n");
		spreadsheat.append("- Money And Items: " + this.getMoneyAndItems() + "\n");

		return spreadsheat;
	}

}
