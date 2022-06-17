package DataStructures;

import java.util.ArrayList;

public class Card {
	
	public Rank rank;
	Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
	    return this.rank.toString() + " of " + this.suit.toString() + "s";
	}
	
	public static int compareCards(Card card1, Card card2) {
		if (card1.rank.value > card2.rank.value) {
			return 1;
		} else if (card1.rank.value < card2.rank.value){
			return 2;
		} else {
			return 3;
		}
		
	}

}
