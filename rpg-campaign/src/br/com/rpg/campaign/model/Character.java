package br.com.rpg.campaign.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * The Abstract Class Character represents a generic form of a 3D&T - Defensores
 * de Toquio 3 Edição Alpha's character.
 * 
 * Any character have the following attributes: name, points, strength,
 * dexterity, endurance, armor, fire power, level, hit points, magic points,
 * advantages, disadvantages, damage types, known spells, money, items and a
 * background history.
 * 
 * A character might be of two types: Playable Character or Non Playable
 * Character. The Playable character is the one owned by a Player. The Non
 * Playable Character is owned by a campaign and differently of the Playable
 * one, it didn't have experience points.
 * 
 * The level attribute is optional in this system, so it is required in
 * character creation but it is not mandatory.
 * 
 * @author jonas
 * @version 1.4
 * @since 02/10/2019
 *
 */
public abstract class Character {

	private Integer id;
	private static Integer sequence = 1;
	private String name;
	private int points;
	private int strength;
	private int dexterity;
	private int endurance;
	private int armor;
	private int firePower;
	private int level;
	private int hitPoints;
	private int magicPoints;
	private Set<String> advantages = new HashSet<>();
	private Set<String> disadvantages = new HashSet<>();
	private Set<String> damageTypes = new HashSet<>();
	private Set<String> knownSpells = new HashSet<>();
	private Set<String> moneyAndItems = new HashSet<>();
	
	private static List<Character> lista = new ArrayList<Character>();

	public Character(){}
	
	public Character(String name, int points, int strength, int dexterity, int endurance, int armor, int firePower,
			int level, int hitPoints, int magicPoints, Set<String> advantages, Set<String> disadvantages,
			Set<String> damageTypes, Set<String> knownSpells, Set<String> moneyAndItems) {

		this.name = name;
		this.points = points;
		this.strength = strength;
		this.dexterity = dexterity;
		this.endurance = endurance;
		this.armor = armor;
		this.firePower = firePower;
		this.level = level;
		this.hitPoints = hitPoints;
		this.magicPoints = magicPoints;
		this.advantages = advantages;
		this.disadvantages = disadvantages;
		this.damageTypes = damageTypes;
		this.knownSpells = knownSpells;
		this.moneyAndItems = moneyAndItems;
		
		this.id = sequence ++;
		
		lista.add(this);

	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	//public abstract StringBuilder printSpreadsheat();

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public void increasePoints(int pointsToIncrease) {
		this.points += pointsToIncrease;
	}

	public void decreasePoints(int pointsToDecrease) {
		this.points -= pointsToDecrease;
	}

	public int getStrength() {
		return strength;
	}

	public void increaseStrength(int strengthToIncrease) {
		this.strength += strengthToIncrease;
	}

	public void decreaseStrength(int strengthToDecrease) {
		this.strength -= strengthToDecrease;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void increaseDexterity(int dexterityToIncrease) {
		this.dexterity += dexterityToIncrease;
	}

	public void decreaseDexterity(int dexterityToDecrease) {
		this.dexterity -= dexterityToDecrease;
	}

	public int getEndurance() {
		return endurance;
	}

	public void increaseEndurance(int enduranceToIncrease) {
		this.endurance += enduranceToIncrease;
	}

	public void decreaseEndurance(int enduranceToDecrease) {
		this.endurance -= enduranceToDecrease;
	}

	public int getArmor() {
		return armor;
	}

	public void increaseArmor(int armorToIncrease) {
		this.armor += armorToIncrease;
	}

	public void decreaseArmor(int armorToDecrease) {
		this.armor -= armorToDecrease;
	}

	public int getFirePower() {
		return firePower;
	}

	public void increaseFirePower(int firePowerToIncrease) {
		this.firePower += firePowerToIncrease;
	}

	public void decreasefirePower(int firePowerToDecrease) {
		this.firePower -= firePowerToDecrease;
	}

	public int getLevel() {
		return level;
	}

	public void increaseLevel(int levelsToIncrease) {
		this.level += levelsToIncrease;
	}

	public void decreaseLevel(int levelsToDecrease) {
		this.level -= levelsToDecrease;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void increaseHitPoints(int hitPointsToIncrease) {
		this.hitPoints += hitPointsToIncrease;
	}

	public void decreaseHitPoints(int hitPointsToDecrease) {
		this.hitPoints -= hitPointsToDecrease;
	}

	public int getMagicPoints() {
		return magicPoints;
	}

	public void increaseMagicPoints(int magicPointsToIncrease) {
		this.magicPoints += magicPointsToIncrease;
	}

	public void decreaseMagicPoints(int magicPointsToDecrease) {
		this.magicPoints -= magicPointsToDecrease;
	}

	public Set<String> getAdvantages() {
		return advantages;
	}

	public void increaseAdvantages(String advantageToIncrease) {
		this.advantages.add(advantageToIncrease);
	}

	public void decreaseAdvantages(String advantagesToDecrease) {
		this.advantages.remove(advantagesToDecrease);
	}

	public Set<String> getDisadvantages() {
		return disadvantages;
	}

	public void increaseDisadvantages(String disadvantageToIncrease) {
		this.disadvantages.add(disadvantageToIncrease);
	}

	public void decreaseDisadvantages(String disadvantagesToDecrease) {
		this.disadvantages.remove(disadvantagesToDecrease);
	}

	public Set<String> getDamageTypes() {
		return damageTypes;
	}

	public void increaseDamageTypes(String damageTypeToIncrease) {
		this.damageTypes.add(damageTypeToIncrease);
	}

	public void decreaseDamageTypes(String damageTypeToDecrease) {
		this.damageTypes.remove(damageTypeToDecrease);
	}

	public Set<String> getKnownSpells() {
		return knownSpells;
	}

	public void increaseKnownSpells(String knownSpellsToIncrease) {
		this.knownSpells.add(knownSpellsToIncrease);
	}

	public void decreaseKnownSpells(String knownSpellsToDecrease) {
		this.knownSpells.remove(knownSpellsToDecrease);
	}

	public Set<String> getMoneyAndItems() {
		return moneyAndItems;
	}

	public void increaseMoneyAndItems(String moneyAndItemsToIncrease) {
		this.moneyAndItems.add(moneyAndItemsToIncrease);
	}

	public void decreaseMoneyAndItems(String moneyAndItemsToDecrease) {
		this.moneyAndItems.remove(moneyAndItemsToDecrease);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public void setAdvantages(Set<String> advantages) {
		this.advantages = advantages;
	}

	public void setDisadvantages(Set<String> disadvantages) {
		this.disadvantages = disadvantages;
	}

	public void setDamageTypes(Set<String> damageTypes) {
		this.damageTypes = damageTypes;
	}

	public void setKnownSpells(Set<String> knownSpells) {
		this.knownSpells = knownSpells;
	}

	public void setMoneyAndItems(Set<String> moneyAndItems) {
		this.moneyAndItems = moneyAndItems;
	}
	
	public Character searchCharacterById(Integer id) {
		for (Character character : lista) {
			if(character.getId() == id) {
				return character;
			}
		}
		return null;
	}

}
