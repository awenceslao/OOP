package jackblack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> Deku = new ArrayList<Card>();
	
	public void initializeDeck(){
		//Create the 52 cards of a standard deck
			//add each one to the array
		
	
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Card c = new Card(Rank.values()[j], Suite.values()[i]);
				Deku.add(c);
			}
		}
		
		for (Card duck : Deku) {
			System.out.println(duck);
		}
		
		/*
		Card c = new Card(Rank.values()[0], Suite.values()[0]);
		System.out.println(c);
		Deku.add(c);
		System.out.println("\n");
		for (Card sut : Deku) {
			System.out.println(sut);
		}*/
	}
	
	//enumPage.enum.ordinal ==> position
	//enumPage.values()[position in enums page] ===> enum in that position
	public void shuffle(){
		Collections.shuffle(Deku);//shuffles deck
	
	}
	

	
}
