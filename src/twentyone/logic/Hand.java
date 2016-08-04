package twentyone.logic;

import java.util.Vector;

public class Hand {

	// Variable for storing cards in an vector array.
	private Vector<Card> hand;

	// Construct the hand object by initializing 
	// an array for storing cards.
	public Hand() {
		hand = new Vector<Card>();
	}
	
	// Clear the hand by removing all elements from the array.
	public void clear() {
		hand.clear();
	}
	
	// Add a card to the hand as long as it exists.
	public void addCard(Card card) {
		if (card != null) {
			hand.add(card);
		}
	}

	// Remove a card from the hand if it is found.
	public void removeCard(Card card) {
		if (hand.contains(card)) {
			hand.remove(card);
		}
	}
	
	// Remove a card at a specified index from the hand.
	public void removeCard(int index) {
		if (isValidIndex(index)) {
			hand.remove(index);
		}
	}
	
	// Return a card at a specified index in the hand.
	public Card getCard(int index) {
		if (isValidIndex(index)) {
			return hand.get(index);
		}
		return null;
	}
	
	// Return the number of cards within the hand.
	public int getCardCount() {
		return hand.size();
	}
	
	// Sorts card array by suit
	public void sortBySuit() {
		// TODO
	}
	
	// Sort card array by rank
	public void sortByRank() {
		// TODO
	}
	
	// Helper method for testing if index is within array bounds.
	private boolean isValidIndex(int index) {
		return (index >= 0 && index < hand.size());
	}
}
