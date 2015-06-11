package temp;

import java.io.*;


public class TIO {
	
	public void write(){
		String filename = "Be_A_Legend.txt";
		try {
			PrintWriter output = new PrintWriter(filename);
			output.println("We are losers, but epic losers.");
			output.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void read(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("Be_A_Legend.txt"));
			String line = br.readLine();
			
			System.out.println(line);
			
			br.close();
		}catch(FileNotFoundException ex) {
            System.out.println("Unable to open file 'Be_A_Legend.txt'");                
        }catch(IOException ex) {
        	System.out.println("Error reading file 'Be_A_Legend.txt'");                   
        }
	}
	
	public static void main(String[] args) {
		new TIO().write();
		new TIO().read();

	}
}
