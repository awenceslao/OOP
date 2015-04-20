package app;

import interfayse.IConsoleViewable;

public class Drive {

	public static void main(String[] args) {
		IConsoleViewable iCon;
		Program p;
		int mainArgs = Integer.parseInt(args[0]);  //Swap out main args here
		switch (mainArgs) {
			case 1:
				iCon = new PirateConsole();
				p = new Program(iCon);
				p.run();
				break;
			case 2:
				iCon = new PrettyConsole();
				p = new Program(iCon);
				p.run();
				break;
			case 3:
				iCon = new AngryConsole();
				p = new Program(iCon);
				p.run();
				break;
			default:
				iCon = new PirateConsole();
				p = new Program(iCon);
				p.run();
		}
	}
	
	
	
}
