package app;

import interfayse.IConsoleViewable;
import java.util.Scanner;

public class AngryConsole implements IConsoleViewable{
	Scanner scan = new Scanner(System.in);
	String userRe;

	@Override
	public String promptForInput() {
		System.out.println("Hey Jerk! Type somethin'! I dare you!");
		userRe = scan.nextLine();
		return userRe;
	}

	@Override
	public void printInput(String input) {
		System.out.println(input.toUpperCase().concat("!"));
	}


	
}
