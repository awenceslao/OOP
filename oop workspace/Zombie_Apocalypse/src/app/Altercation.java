package app;

import enums.Weapons;
import models.Human;
import models.Zombie;
import java.util.Random;
	//make method for fight where each use of weapon reduces stamina of user 
		//and health of enemy
public class Altercation {
	Random r = new Random();
	
	public void setDamage(Human h){
		switch (h.getWep()) {
		case BAT:
			h.setDMG(r.nextInt(10)+25);
			break;
		case CROWBAR:
			h.setDMG(r.nextInt(10)+35);
			break;
		case SLEDGEHAMMER:
			h.setDMG(r.nextInt(10)+40);
			break;
		default:
			h.setDMG(10);
		}
	}
	
	public void setCurrentStamina(Human h){
		switch (h.getWep()) {
		case BAT: //5swings
			h.setStaminaDrop(12);
			break;
		case CROWBAR:
			h.setStaminaDrop(20);
			break;
		case SLEDGEHAMMER:
			h.setStaminaDrop(50);
			break;
		default:
			h.setStaminaDrop(10);
		}
	}
	
	
	public void setCurrentStamina(Zombie z){
		z.setStaminaDrop(10);
	}
	
	public void setDamage(Zombie z){
		z.setDMG(15);
	}
	

	public void swing(Human h, Zombie z){
		System.out.println("You swing your " + h.getWep() + "\n\tDamage Dealt: " + h.getDMG());
		z.setHealth(z.getHealth() - h.getDMG());
		h.setStamina(h.getStamina() - h.getStaminaDrop());
		System.out.println(h);
		System.out.println(z);
	}
	
	public void bite(Zombie z, Human h){
		System.out.println("The Zombie takes a bite out of you\n\tDamage Dealt: " + z.getDMG());
		h.setHealth(h.getHealth() - z.getDMG());
		z.setStamina(z.getStamina() - z.getStaminaDrop());
		System.out.println(h);
		System.out.println(z);
	}
	
	
	
/*	public static void main(String[] args) {
		Altercation a = new Altercation();
		Human ted = new Human(100, 75, Weapons.CROWBAR);
		Zombie zed = new Zombie(200, 50, Weapons.BITE, 1);
		
		System.out.println(ted  + "\n\n" + zed + "\n\n");
		
		
		
		a.setDamage(ted);
		a.setCurrentStamina(ted);
		a.setDamage(zed);
		a.setCurrentStamina(zed);
		
		a.swing(ted, zed);
		a.bite(zed, ted);

		
	}*/
	
	
	
}
