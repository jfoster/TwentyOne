package twentyone.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import twentyone.enums.Rank;
import twentyone.enums.Suit;
import twentyone.logic.Card;
import twentyone.logic.Deck;
import twentyone.logic.Hand;

public class Tests {
	
	// Test 1
	@Test
	public void testCardGetSuitAsString() {
		Card card;
		card = new Card(Suit.CLUBS, Rank.ACE);
		assertEquals("Clubs", card.getSuitName());
		card = new Card(Suit.DIAMONDS,Rank.FOUR);
		assertEquals("Diamonds", card.getSuitName());
		card = new Card(Suit.HEARTS,Rank.EIGHT);
		assertEquals("Hearts", card.getSuitName());
		card = new Card(Suit.SPADES,Rank.QUEEN);
		assertEquals("Spades", card.getSuitName());
	}
	
	// Test 2
	@Test
	public void testCardGetValueAsString() {
		Card card;
		card = new Card(Suit.CLUBS,Rank.ACE);
		assertEquals("Ace", card.getRankName());
		card = new Card(Suit.CLUBS,Rank.TWO);
		assertEquals("Two", card.getRankName());
		card = new Card(Suit.CLUBS, Rank.THREE);
		assertEquals("Three", card.getRankName());
	}
	
	// Test 3
	@Test
	public void testDeckCardsLeft() {
		Deck deck = new Deck();
		assertEquals(52, deck.getCardsUsed());
	}
	
	// Test 4
	@Test
	public void testHandIsEmpty() {
		Hand hand = new Hand();
		Card card = new Card(Suit.DIAMONDS, Rank.ACE);
		hand.addCard(card);
		assertEquals(card,hand.getCard(0));
		hand.clear();
		assertEquals(0, hand.getCardCount());
	}
	
	// Test 5
	@Test
	public void testRemoveCard() {
		Hand hand = new Hand();
		Card card = new Card(Suit.CLUBS, Rank.TEN);
		hand.addCard(card);
		assertEquals(1,hand.getCardCount());
		hand.removeCard(card);
		assertEquals(0,hand.getCardCount());
	}
	
	// Test 6
	@Test
	public void testDeckCount(){
		Deck deck = new Deck();
		deck.shuffle();
		assertEquals(52, deck.getCardsUsed());
		deck.dealCard();
		assertEquals(51, deck.getCardsUsed());
	}

}
