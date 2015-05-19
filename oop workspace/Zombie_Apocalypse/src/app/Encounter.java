package app;

import java.util.Scanner;

import models.Human;
import models.Zombie;
import enums.Weapons;

public class Encounter{
	Scanner input = new Scanner(System.in);
	Human h1;
	Weapons w;
	Zombie z;
	Altercation a = new Altercation();
	
	private int hp;
	private int stam;	
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStam() {
		return stam;
	}

	public void setStam(int stam) {
		this.stam = stam;
	}


	public void setCharStats(){
		boolean setting = true;
		do{
			System.out.println("What is your build?\n1. Slim\t\t2. Average\t3. Adonis");
			String b = input.nextLine();
			int build = Integer.parseInt(b);
			switch (build) {
			case 1:
				setHp(50);
				setStam(125);
				setting = false;
				break;
			case 2:
				setHp(100);
				setStam(80);
				setting = false;
				break;
			case 3:
				setHp(150);
				setStam(50);
				setting = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}while(setting);
		
	}

	public void setCharWep(){
		boolean choosing = true;
		do{
			System.out.println("Choose your weapon:\n1. Bat\t\t2. Crowbar\t3. Sledgehammer");
			String welp = input.nextLine();
			int weapon = Integer.parseInt(welp);
			switch (weapon) {
			case 1:
				w = Weapons.BAT;
				choosing = false;
				break;
			case 2:
				w = Weapons.CROWBAR;
				choosing = false;
				break;
			case 3:
				w = Weapons.SLEDGEHAMMER;
				choosing = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}while(choosing);
	}

	public void buildChar(){
		setCharStats();
		setCharWep();
		h1 = new Human(getHp(), getStam(), w);
		a.setDamage(h1);
		System.out.println(h1);
	}
	
	public void buildZ(){
		z = new Zombie(125, 75, w.BITE, 4);
		a.setDamage(z);
	}
	
	public void theStory(){
		System.out.println("You can clearly remember the day the bombs dropped all those years ago."
				+ "\nDC and LA were the first to go. The rest of the US followed.\nWhen the attacks finally"
				+ " stopped, you thought it a sign of peace in the coming days......You were wrong.");
		System.out.println("\n*Press Enter to Continue...*\n");
		String placeholder = input.nextLine();
		System.out.println("Within hours of the final bombing runs, the most unbelievable happened.\n"
				+ "Like something out of a comic book, the dead began to reanimate. Those who you witnessed die\nnot minutes before"
				+ " were up and walking about. Limping, Searching, for something....No someone");
		System.out.println("\n*Press Enter to Continue...*\n");
		placeholder = input.nextLine();
		System.out.println("Its been over 30 years, but a cure is finally within reach.\nThe only component"
				+ " missing....is you. Your body has contained the \nanti-bodies for the cure the whole time."
				+ "You're all alone with no supplies left.\nYou won't last another night.You must make it to "
				+ "the last remaining CDC or perish.....Good Luck");
		System.out.println("\n*Press Enter to Continue...*\n");
		placeholder = input.nextLine();
		System.out.println("\tGAME START!");
	}
	
	
	public void zDay(){
		buildChar();
	}
	
	
	public static void main(String[] args) {
		Encounter e = new Encounter();
		e.theStory();
	}
	
	
	
	
	
	
	
	
	
	
	
}