package models;

import enums.Weapons;

public class Human {
	protected int Health;
	protected int Stamina;
	protected Weapons wep;
	protected int DMG;
	protected int StaminaDrop;
	
	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getStamina() {
		return Stamina;
	}

	public void setStamina(int stamina) {
		Stamina = stamina;
	}
	
	public Weapons getWep() {
		return wep;
	}

	public void setWep(Weapons wep) {
		this.wep = wep;
	}

	
	public int getDMG() {
		return DMG;
	}

	public void setDMG(int dMG) {
		DMG = dMG;
	}	
	
	
	public int getStaminaDrop() {
		return StaminaDrop;
	}

	public void setStaminaDrop(int staminaDrop) {
		StaminaDrop = staminaDrop;
	}

	
	
	
	
	public Human(int _Health, int _Stamina, Weapons w) {
		setHealth(_Health);
		setStamina(_Stamina);
		setWep(w);
	}
	
	
	@Override
	public String toString(){
		String state = "Human: \n" + "Health: " + getHealth()
				+ "\tStamina: " + getStamina() + "\nWeapon: " + getWep();
		return state;
	}
	
	
	
}
