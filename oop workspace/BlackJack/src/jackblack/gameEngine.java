package jackblack;
import java.util.Scanner;

public class gameEngine {
	Scanner userInput = new Scanner(System.in);
	private String playerName;
	
	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String pName) {
		playerName = pName;
	}
	
	//for collecting each player's name
	public void intro(){
		System.out.println("enter name: ");
		setPlayerName(userInput.nextLine());
		System.out.println("welcome " + getPlayerName());
	}

}
