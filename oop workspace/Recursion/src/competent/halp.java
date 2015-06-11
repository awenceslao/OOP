package competent;

public class halp {
	static int counter = 0;
	static String[] table = new String[11];
	
	public String run(int num){
		String block = num + "*" + counter + "=" + (num*counter);
		if(counter == 11){
			for (String string : table) {
				System.out.println(string);				
			}
			return block;
		}
		else{
			counter++;
			table[counter-1] = block;
			run(num);
			return block;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new halp().run(3);
	}
	

}
