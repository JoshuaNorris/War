package DataStructures;

public class Player {
	
	public Deck deck = new Deck();
	
	public Player() {
	}
	
	public void addCard(Card card) {
		this.deck.addCard(card);
	}
	
	public String viewCards() {
		return deck.toString();
	}
	
	public Card drawCard() {
		return deck.drawCard();
	}
}
