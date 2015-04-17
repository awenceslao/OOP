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
	
	public static void main(String[] args) {
		IConsoleViewable ic;
		Program p;
		
		int tempt = Integer.parseInt(args[0]);
		switch(tempt){
			case 1:
				ic = new PirateConsole();
				p = new Program(ic);
				p.run();
				break;
			case 2:
				ic = new PrettyConsole();
				p = new Program(ic);
				p.run();
				break;
			case 3: 
				ic = new AngryConsole();
				p = new Program(ic);
				p.run();
				break;
		}
		
		
		
		/*PirateConsole pc = new PirateConsole();
		Program p = new Program(pc);
		p.run();*/
		
	}
	
	
}
