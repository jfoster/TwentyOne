package twentyone.logic;

import java.util.Collections;
import java.util.Vector;

import twentyone.enums.Rank;
import twentyone.enums.Suit;

public class Deck {
	
	private Vector<Card> deck;
	private int cardsUsed;
	
	public Deck() {
		deck = new Vector<Card>(52);
		
		int temp = 0;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(temp, new Card(suit, rank));
				temp++;
			}
		}
		cardsUsed = 0;
	}
	
	// shuffle the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	// deal a card
	public Card dealCard() {
		cardsUsed++;
		
		if (cardsUsed > 52) {
			cardsUsed = 1;
		}
		return deck.get(cardsUsed - 1);
	}
	
	// the number of cards that are no longer in the deck
	public int getCardsUsed() {
		return cardsUsed;
	}
}
