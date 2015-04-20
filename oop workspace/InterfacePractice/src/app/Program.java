package app;

import interfayse.IConsoleViewable;

public class Program {
	IConsoleViewable iCon;
	
	public Program(IConsoleViewable icv) {
		iCon = icv;
	}

	public void run() {
		String temp = iCon.promptForInput();
		iCon.printInput(temp);
		
	}
	
	
}
