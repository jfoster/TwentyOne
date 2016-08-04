package twentyone.logic;

import twentyone.enums.Rank;
import twentyone.enums.Suit;

public class Card {
	private Suit suit;
	private Rank rank;
	
	// Construct card with a defined suit and rank.
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// Return the card's suit.
	public Suit getSuit() {
		return suit;
	}
	
	// Return suit name.
	public String getSuitName() {
		return suit.toString();
	}
	
	// Return the card's rank.
	public Rank getRank() {
		return rank;
	}
	
	// Return the card's rank name in string form.
	public String getRankName() {
		return rank.toString();
	}
	
	// Return rank numerical value.
	public int getRankValue() {
		return rank.getValue();
	}
}