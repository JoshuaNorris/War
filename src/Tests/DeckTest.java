package Tests;
import DataStructures.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DataStructures.Card;
import DataStructures.Deck;
import DataStructures.Rank;
import DataStructures.Suit;

class DeckTest {

	@Test
	void test() {
		
		Deck deck = new Deck();
		deck.addAllCards();
		assertEquals(deck.deck.size(), 52);
		
		Card card = new Card(Rank.TWO, Suit.HEART);
		assertEquals(deck.drawCard().rank, card.rank);
		
		assertEquals(deck.deck.size(), 51);
	}

}
