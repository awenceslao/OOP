package app;

import interfayse.IConsoleViewable;
import java.util.Scanner;

public class PrettyConsole implements IConsoleViewable {
	Scanner scanLee = new Scanner(System.in);
	String userRe = "";

	@Override
	public String promptForInput() {
		System.out.println("<BLUE>Print something maybe?</BLUE>");
		userRe += scanLee.nextLine();
		return userRe;
	}

	@Override
	public void printInput(String input) {		
		System.out.println("<PINK>" + input + "</PINK>");
	}

}
