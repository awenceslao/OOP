package game;

public class DiceBag {
	private int resultofRoll = 0;
	
	public int getResultofRoll() {
		return resultofRoll;
	}

	public void setResultofRoll(int resultofRoll) {
		this.resultofRoll = resultofRoll;
	}

	/**
	 * parameter will be parsed to get number of dice and number of sides
	 * Enter String in the format "2d6"
	 */
	public void rollDice(String diceXsides){
		String[] diceNums = diceXsides.split("d");
		int numOfDice = Integer.parseInt(diceNums[0]); //Parses number of dice
		int numOfSides = Integer.parseInt(diceNums[1]); //Parses number of sides per dice
		
		for (int i = 0; i < numOfDice; i++) {
			Die d = new Die(numOfSides);
			int result = d.roll();
			resultofRoll += result;
		}
		
	}
	
}
