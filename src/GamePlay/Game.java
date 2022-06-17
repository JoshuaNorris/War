package GamePlay;

import DataStructures.Card;
import DataStructures.Deck;
import DataStructures.Player;

public class Game {
	
    static Player player1;
	static Player player2;
	static Deck playPile;
	static int smallestDeckSize;
	static boolean game;

	public Game(Player player1, Player player2) {
		game = true;
		smallestDeckSize = 52;
		playPile = new Deck();
		this.player1 = player1;
		this.player2 = player2;
	}

	public Game() {
		game = true;
		smallestDeckSize = 52;
		player1 = new Player();
		player2 = new Player();
		playPile = new Deck();
		
	}
	
	
	
	public static void dealDeck() {
		Deck initialDeck = new Deck();
		initialDeck.addAllCards();
		initialDeck.shuffle();
		for (int x = 0; x < 52; x++) {
			if (x < 26) {
				Card card = initialDeck.drawCard();
				player1.addCard(card);
			} else {
				Card card = initialDeck.drawCard();
				player2.addCard(card);
			}
		}
		checkSmallestDeckSize();
	}
	
	public static void playersFlipCards() {
		Card player1Card = player1.drawCard();
		Card player2Card = player2.drawCard();
		playPile.addCard(player1Card);
		playPile.addCard(player2Card);
		
		int winner = Card.compareCards(player1Card, player2Card);
		if (winner == 1) {
			while (playPile.deck.size() != 0) {
				player1.addCard(playPile.drawCard());
			}
		} else if (winner == 2) {
			while (playPile.deck.size() != 0) {
				player2.addCard(playPile.drawCard());
			}
		} else {
			checkSmallestDeckSize();
			if (smallestDeckSize > 0) {
				playersGoToWar();
			} else {
				if (player1.deck.deck.size() > player2.deck.deck.size()) {
					player1.addCard(playPile.drawCard());
				} else {
					player2.addCard(playPile.drawCard());
				}
			}
			
		}
		checkSmallestDeckSize();
	}
	
	private static void playersGoToWar() {
		if (smallestDeckSize >= 4) {
			for (int x = 0; x < 3; x++)
			playPile.addCard(player1.drawCard());
			playPile.addCard(player2.drawCard());
		} else if (smallestDeckSize == 3) {
			for (int x = 0; x < 2; x++)
				playPile.addCard(player1.drawCard());
				playPile.addCard(player2.drawCard());
		} else if (smallestDeckSize == 2) {
			playPile.addCard(player1.drawCard());
			playPile.addCard(player2.drawCard());
		} else {
		}
		
		

		playersFlipCards();
	}
	
	private static void checkSmallestDeckSize() {
		int player1size = player1.deck.deck.size();
		int player2size = player2.deck.deck.size();
		if (player1size <= player2size) {
			if (player1size == 0) {
				smallestDeckSize = 0;
				game = false;
			} else {
				smallestDeckSize = player1size;
			}
		} else {
			if (player2size == 0) {
				smallestDeckSize = 0;
				game = false;
			} else {
				smallestDeckSize = player2size;
			}
		}
	}
	
	public Player getPlayer1() {
		return player1;
	}
	
	public Player getPlayer2() {
		return player2;
	}
		
	public boolean getGameBoolean() {
		return game;
	}
	
	public int getSmallestDeckSize() {
		return smallestDeckSize;
	}
	
	public void gameOver() {
		this.game = false;
	}
		
	
}
