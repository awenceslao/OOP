package game;

import character.RPGCharacter;
import items.items;
import items.pack;

import java.util.Scanner;

public class GameMaster {
	Scanner scaniel = new Scanner(System.in);
	DiceBag bag;
	RPGCharacter hero = new RPGCharacter(0, 0, 0);
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		name = _name;
	}

	public void generateNewCharacter(){
		System.out.println(getName());
		strengthPoints();
		intelligencePoints();
		dexterityPoints();	
		hero.setMaxHealth(hero.getStrength());
		hero.setCurrentHealth(hero.getMaxHealth());
		System.out.println(hero);
		
	}
	
	public void strengthPoints(){
		bag = new DiceBag();
		bag.rollDice("3d6");
		int total = bag.getResultofRoll();
		if(total >= 16){
			bag.rollDice("1d6");
			int newTotal = bag.getResultofRoll();
			if(newTotal - total == 6){
				bag.rollDice("1d6");
			}			
		}
		hero.setStrength(bag.getResultofRoll());
		//System.out.println("Strength Points: " + hero.getStrength());
	}
	
	public void intelligencePoints(){
		bag = new DiceBag();
		bag.rollDice("3d6");
		int total = bag.getResultofRoll();
		if(total >= 16){
			bag.rollDice("1d6");
			int newTotal = bag.getResultofRoll();
			if(newTotal - total == 6){
				bag.rollDice("1d6");
			}			
		}
		hero.setIntelligence(bag.getResultofRoll());
		//System.out.println("Intelligence Points: " + hero.getIntelligence());
	}
		
	public void dexterityPoints(){
		bag = new DiceBag();
		bag.rollDice("3d6");
		int total = bag.getResultofRoll();
		if(total >= 16){
			bag.rollDice("1d6");
			int newTotal = bag.getResultofRoll();
			if(newTotal - total == 6){
				bag.rollDice("1d6");
			}			
		}
		hero.setDexterity(bag.getResultofRoll());
		//System.out.println("Dexterity Points: " + hero.getDexterity());
	}
	
	public void dmgChar(){
		System.out.println("Enter Damage To Be Dealt");
		String damage = scaniel.nextLine();
		int dmg = Integer.parseInt(damage);
		dmg = dmg - (dmg * 2);
		hero.adjustHealth(dmg);
		System.out.println(hero);
	}
	
	public void heal(){
		System.out.println("Enter Amount To Heal");
		String rejuv = scaniel.nextLine();
		int restore = Integer.parseInt(rejuv);
		hero.adjustHealth(restore);
		System.out.println(hero);
	}
	
	public void adjustStrength(){
		System.out.println("What is the new value of your Strength?"
				+ "\n\t**Changing Strength will also change your Max Health**");
		String value = scaniel.nextLine();
		int val = Integer.parseInt(value);
		hero.setStrength(val);
		hero.setMaxHealth(hero.getStrength());
		hero.setCurrentHealth(hero.getMaxHealth());
		System.out.println(hero);
	}
	
	public void adjustIntelligence(){
		System.out.println("What is the new value of your Intelligence?");
		String value = scaniel.nextLine();
		int val = Integer.parseInt(value);
		hero.setIntelligence(val);
		System.out.println(hero);
	}
	
	public void adjustDexterity(){
		System.out.println("What is the new value of your Dexterity?");
		String value = scaniel.nextLine();
		int val = Integer.parseInt(value);
		hero.setDexterity(val);
		System.out.println(hero);
	}
	
	public void adjustMaxHealth(){
		System.out.println("What is the new value of your Max Health?"
				+ "\n\t**Changing Max Health will NOT change your Strength**");
		String value = scaniel.nextLine();
		int val = Integer.parseInt(value);
		val =  ((val /10)- 1) * 3;
		hero.setMaxHealth(val);
		hero.setCurrentHealth(hero.getMaxHealth());
		System.out.println(hero);
		
	}
	
	public void adjustCurrentHealth(){
		System.out.println("What is the new value of your Current Health?"
				+ "\n\t**Enter either positive or negative value**");
		String value = scaniel.nextLine();
		int val = Integer.parseInt(value);
		hero.setCurrentHealth(val);
		System.out.println(hero);		
	}
	
	public void adjustGold(){
		System.out.println("Enter amount of gold to give or take");
		String go = scaniel.nextLine();
		int currency = Integer.parseInt(go);
		if(currency < 0){
			hero.setGold(0);
		}
		else{
			hero.setGold(currency);
		}
	}
	
	public void createItem(){
		System.out.println("What is the name of the item?");
		String nam = scaniel.nextLine();		//Name of the item
		System.out.println("What is the size of the item?");
		String syze = scaniel.nextLine();
		int size = Integer.parseInt(syze);		//Size of the item
		System.out.println("How much does the item cost?");
		String costco = scaniel.nextLine();
		int cost = Integer.parseInt(costco);	//Cost of item
		System.out.println("How much does it sell for?");
		String val = scaniel.nextLine();
		int value = Integer.parseInt(val);
		
		items newItem = new items(nam, size, cost, value);
		hero.recieveItem(newItem);
		
	}
	
	public void removal(){
		System.out.println("Enter the index of the item you wish to remove");
		String position = scaniel.nextLine();
		int toRemove = Integer.parseInt(position);
		System.out.println(hero.getInventory().get(toRemove));
		hero.getInventory().remove(toRemove);
	}
	
	public void inventoryIO(){
		boolean inMenu = true;
		//pack _satchel = new pack("satchel", 2, 20, 9, 15, null);
		do{
			System.out.println("1. Create a New Item\t2. Remove an Item\t3. Dump Inventory\t"
					+ "4. View Inventory\t5. Exit to Main Menu");
			String inv = scaniel.nextLine();
			int invent = Integer.parseInt(inv);
			switch (invent) {
			case 1:
				createItem();
				break;
			case 2:
				removal();
				break;
			case 3:
				System.out.println("Items Dumped: " + hero.getInventory());
				break;
			case 4:
				System.out.println(hero.getInventory());
				break;
			case 5:
				inMenu = false;
			default:
				System.out.println("Not a valid menu choice");
			}
		}while(inMenu);
	}
	
	public void editCharIO(){
		boolean editing = true;
		do {
			System.out.println("What will you change?\n1. Max Health\t2. Strength"
					+ "\t3. Intelligence\t\t4. Dexterity\t5. Current Health"
					+ "\t6. Gold\t7. Return To Menu");
			String menuChoice = scaniel.nextLine();
			int menu = Integer.parseInt(menuChoice);
			switch (menu) {
			case 1:
				adjustMaxHealth();
				break;
			case 2:
				adjustStrength();
				break;
			case 3:
				adjustIntelligence();
				break;
			case 4:
				adjustDexterity();
				break;
			case 5: 
				adjustCurrentHealth();
				break;
			case 6:
				adjustGold();
				break;
			case 7: 
				editing = false;
				break;
			default:
				System.out.println("Not a valid menu choice");
			}
		} while (editing);
	}
	
	public void consoleIO(){
		boolean inMainMenu = true;
		System.out.println("Welcome, please name your character");
		setName(scaniel.nextLine());
		System.out.println("These are your stats: ");
		generateNewCharacter();
		do {
			System.out.println(" 1. Create New Character\t2. Edit Character\t"
					+ "3. Damage Character\t4. Heal Character\t5. Check Inventory\t6. Exit");
			String menuChoice = scaniel.nextLine();
			int menu = Integer.parseInt(menuChoice);
			switch (menu) {
			case 1:
				generateNewCharacter();
				break;
			case 2:
				editCharIO();
				break;
			case 3:
				dmgChar();
				break;
			case 4:
				heal();
				break;
			case 5:
				inventoryIO();
				break;
			case 6:
				inMainMenu = false;
				break;
			default:
				System.out.println("Not a valid menu choice");
			}
		} while (inMainMenu);
		
		
	}
	
	public static void main(String[] args) {
		GameMaster gm = new GameMaster();
		gm.consoleIO();

	}
}
