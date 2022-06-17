package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
	
	public ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void addAllCards() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	public void addCard(Card card) {
		this.deck.add(card);
	}
	
	public String toString() {
		String output = "";
	    for (Card card : this.deck) {
	    	output = output + card.toString() + "\n";
	    }
	    output = output.substring(0, output.length() - 1);
	    return output;
	}
	
	public Card drawCard () {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}
}
