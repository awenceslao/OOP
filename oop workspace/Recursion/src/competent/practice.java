
package competent;


public class practice {
	static int counter = 0;
	static String backword = "";

	public String run(String word){
		if(counter == word.length()){
			System.out.println(backword);
			return backword;
		}
		else{
			counter++;
			backword += word.charAt(word.length() - counter);
			run(word);
			return backword;
		}
		
	}	
	public static void main(String[] args) {
		new practice().run("stop");
	}
}
