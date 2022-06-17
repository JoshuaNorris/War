package Tests;

import DataStructures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DataStructures.Card;
import DataStructures.Rank;
import DataStructures.Suit;

class CardTest {

	@Test
	void testToString() {
		Card card = new Card(Rank.EIGHT, Suit.CLUB);
		String result = "EIGHT of CLUBs";
		assertEquals(card.toString(), result);
	}
	
	@Test
	void testCompareCards() {
		Card Club8 = new Card(Rank.EIGHT, Suit.CLUB);
		Card Diamond8 = new Card(Rank.EIGHT, Suit.DIAMOND);
		Card Club9 = new Card(Rank.NINE, Suit.CLUB);
		Card Club7 = new Card(Rank.SEVEN, Suit.CLUB);
		
		assertEquals(Card.compareCards(Club8, Club7), 1);
		assertEquals(Card.compareCards(Club8, Club9), 2);
		assertEquals(Card.compareCards(Club8, Diamond8), 3);
	}

}
