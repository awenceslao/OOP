package app;

import interfayse.IConsoleViewable;
import java.util.Scanner;

public class PirateConsole implements IConsoleViewable{
	Scanner userIn = new Scanner(System.in);
	String userRe;

	@Override
	public String promptForInput() {
		System.out.println("Ahoy there! Enter ye text here, or ye'll be condemned to Davy Jones' Locker");
		userRe = userIn.nextLine();
		return userRe;
	}

	
	@Override
	public void printInput(String input) {	
		System.out.println(input.replaceAll("r", "-ARR-").concat(", me hearty!"));
		
	}

	
}
