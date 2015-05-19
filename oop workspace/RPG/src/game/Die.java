package game;

import java.util.Random;

public class Die {
	Random number;
	private final int numOfSides;
	private int dieResult;
	
	//Constructor
	/**
	 * 
	 * @param dieSides - Number of sides to the dice you are rolling
	 */
	public Die(int dieSides) {
		numOfSides = dieSides;
	}
	
	//Roll Die method
	public int roll(){
		number = new Random();
		dieResult = number.nextInt(numOfSides)+1;
		return dieResult;
	}
	

}
