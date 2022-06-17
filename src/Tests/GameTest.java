package Tests;

import GamePlay.Game;
import DataStructures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DataStructures.Rank;
import DataStructures.Suit;

class GameTest {

	/*
	@Test
	void testDealDeck() {
		Game game = new Game();
		game.dealDeck();
		assertEquals(game.getPlayer1().deck.deck.size(), 26);
		assertEquals(game.getPlayer2().deck.deck.size(), 26);
	}
	*/
	
	@Test
	void test() {
		// This is testing dealDeck()
		Game firstGame = new Game();
		firstGame.dealDeck();
		assertEquals(firstGame.getPlayer1().deck.deck.size(), 26);
		assertEquals(firstGame.getSmallestDeckSize(), 26);
		
		// This is testing playersFlipCards
		Game secondGame = new Game(player1Example(), player2Example());
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 7);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 9);
		assertEquals(secondGame.getSmallestDeckSize(), 7);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 2);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 14);
		assertEquals(secondGame.getSmallestDeckSize(), 2);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 4);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 12);
		assertEquals(secondGame.getSmallestDeckSize(), 4);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 3);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 13);
		assertEquals(secondGame.getSmallestDeckSize(), 3);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 2);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 14);
		assertEquals(secondGame.getSmallestDeckSize(), 2);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 1);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 15);
		assertEquals(secondGame.getSmallestDeckSize(), 1);
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 0);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 16);
		assertEquals(secondGame.getSmallestDeckSize(), 0);
		assertEquals(secondGame.getGameBoolean(), false);
	}
	
	/*
	@Test
	void test() {
		// This is testing playersFlipCards
		Game secondGame = new Game(player1Example(), player2Example());
		secondGame.playersFlipCards();
		assertEquals(secondGame.getPlayer1().deck.deck.size(), 7);
		assertEquals(secondGame.getPlayer2().deck.deck.size(), 9);
		assertEquals(secondGame.getSmallestDeckSize(), 7);
	}
	*/
	
	
	
	private Player player1Example() {
		Player player = new Player();
		player.addCard(new Card(Rank.SEVEN, Suit.DIAMOND));
		player.addCard(new Card(Rank.SIX, Suit.DIAMOND));
		player.addCard(new Card(Rank.TWO, Suit.DIAMOND));
		player.addCard(new Card(Rank.FIVE, Suit.DIAMOND));
		player.addCard(new Card(Rank.KING, Suit.DIAMOND));
		player.addCard(new Card(Rank.TWO, Suit.DIAMOND));
		player.addCard(new Card(Rank.FIVE, Suit.DIAMOND));
		player.addCard(new Card(Rank.THREE, Suit.DIAMOND));
		return player;
		
	}
	
	private Player player2Example() {
		Player player = new Player();
		player.addCard(new Card(Rank.JACK, Suit.DIAMOND));
		player.addCard(new Card(Rank.SIX, Suit.HEART));
		player.addCard(new Card(Rank.THREE, Suit.DIAMOND));
		player.addCard(new Card(Rank.SEVEN, Suit.DIAMOND));
		player.addCard(new Card(Rank.TEN, Suit.DIAMOND));
		player.addCard(new Card(Rank.THREE, Suit.DIAMOND));
		player.addCard(new Card(Rank.FIVE, Suit.HEART));
		player.addCard(new Card(Rank.TWO, Suit.DIAMOND));
		return player;
	}

}
