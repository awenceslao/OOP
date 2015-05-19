package models;

import enums.Weapons;
	//Need to automatically give Zombie the bite weapon
public class Zombie extends Human{
	private int hungerLevel;

	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	
	
	
	/**
	 * Hunger Level Scale
	 * 1 Ravenous   -    10 Full
	 */
	public Zombie(int _Health, int _Stamina, Weapons w, int _hungerLevel) {
		super(_Health, _Stamina, w);
		setHungerLevel(_hungerLevel);
	}

	
	@Override
	public String toString(){
		String state = "Zombie: \n" + "Health: " + getHealth()
				+ "\tStamina: " + getStamina() + "\tHunger Level: " + getHungerLevel()
				+ "\nWeapon: " + getWep();
		return state;
	}
	
	
	
	

}
