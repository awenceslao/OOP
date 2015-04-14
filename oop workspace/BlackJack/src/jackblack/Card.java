package jackblack;
import java.util.Random;

public class Card {
		Random random;
		private final Rank ran;
		private final Suite suite;
		private int Value;
		
		
		
		public int getValue() {
			return Value;
		}
		public void setValue(int value) {
			Value = value;
		}
		public Rank getRank() {
			return ran;
		}
		public Suite getSuite() {
			return suite;
		}
		
		
		public Card(Rank figureHead, Suite sweet) {
			ran = figureHead;
			suite = sweet;	
		}
		
		
		@Override
		public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append(ran + " of " + suite);
			return sb.toString();
		}
		
	
	
	
	
	
	
	
	
	
}

