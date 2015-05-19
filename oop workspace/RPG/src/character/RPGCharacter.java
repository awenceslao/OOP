package character;

import items.items;
import items.pack;

import java.util.ArrayList;

public class RPGCharacter {
	private int Strength =  0;
	private int Dexterity = 0;
	private int Intelligence = 0;
	private int maxHealth;
	private int currentHealth;
	private ArrayList<pack> inventory = new ArrayList<pack>();
	private int gold;

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public int getDexterity() {
		return Dexterity;
	}

	public void setDexterity(int dexterity) {
		Dexterity = dexterity;
	}

	public int getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}

	public int getMaxHealth() {
		return maxHealth;
	}
	
	/** 
	 * @param _maxHealth - _maxHealth = value of Strength
	 */
	public void setMaxHealth(int _maxHealth) {
		_maxHealth = ((_maxHealth / 3)+1) * 10;
		maxHealth = _maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}
	
	public void setCurrentHealth(int _adjust){
		if(_adjust > maxHealth){
			currentHealth = maxHealth;			
		}
		else{
			currentHealth = _adjust;
		}
	}

	
	
	public void adjustHealth(int _hitpoints){
		if(currentHealth + _hitpoints > maxHealth){
			currentHealth = maxHealth;
		}
		else{
			currentHealth += _hitpoints;			
		}
	}

	
	public ArrayList<pack> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<pack> inventory) {
		this.inventory = inventory;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	
	
	
	public RPGCharacter(int str, int dex, int intel) {
	}
	
	public boolean isDead(){
		if(currentHealth == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString(){
		String state = "Health: " + getCurrentHealth() + "/" + getMaxHealth() + "\n\t"
				 + "Strength: " +getStrength() + "\n\t" + "Intelligence: " 
				 + getIntelligence() + "\n\t" + "Dexterity: " +  getDexterity() + "\n\n" + getInventory();
		return state;
		
	}
	
	
	public boolean recieveItem(items toRecieve){
		boolean successful = false;
		if(toRecieve.getItemSize() < inventory.size()){
			inventory.add((pack) toRecieve);
			System.out.println("Item added");
			successful = true;
		}
		System.out.println("Could Not Add Item");
		return successful;
	}
	
	
	
	
	
	
	public items giveItem(int _index){
		//needs to remove an item from inventory
			//directly or through index
		//return that item or null if it doesn't exist
		if(_index < 0 || _index > (inventory.size() - 1) ){
			return null;
		}
		else {
		inventory.remove(_index);
		return inventory.get(_index);
		}
	}
	
	
	
	
	
}
