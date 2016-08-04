package twentyone.logic;

import twentyone.enums.Strings;

public class Game {

	private boolean isGameInProgress;

	private Deck deck;

	private Hand21 playerHand;
	private Hand21 dealerHand;

	private String message;
	private String tooltip;

	public Game() {
		doNewGame();
	}

	public void doNewGame() {
		
		setGameInProgress(true);

		setDeck(new Deck());
		getDeck().shuffle();

		setDealerHand(new Hand21());
		setPlayerHand(new Hand21());

		for (int i = 0; i < 2; i++) {
			getDealerHand().addCard( getDeck().dealCard() );
			getPlayerHand().addCard( getDeck().dealCard() );
		}

		if (getDealerHand().getTwentyOneValue() == 21) {
			setMessage("Dealer has Blackjack. " + Strings.LOSE.get(), Strings.NEW_GAME.get());
			setGameInProgress(false);
		} else if (getPlayerHand().getTwentyOneValue() == 21) {
			setMessage("You have Blackjack. " + Strings.WIN.get(), Strings.NEW_GAME.get());
			setGameInProgress(false);
		} else {
			setMessage("You have " + getPlayerHand().getTwentyOneValue() + ". Hit or Stand?", Strings.HIT_OR_STAND.get());
		}
	}
	
	public void doHit() {		
		if (!isGameInProgress()) {
			setMessage(Strings.NEW_GAME.get(), Strings.NEW_GAME.get());
			return;
		}
		
		getPlayerHand().addCard(getDeck().dealCard());

		if (getPlayerHand().getTwentyOneValue() > 21 ) {
			setMessage("You're bust! You lose.", null);
			setGameInProgress(false);
		}
		else if (getPlayerHand().getTwentyOneValue() == 21) {
			setMessage("You have blackjack! You win.", null);
			setGameInProgress(false);
		}
		else if (getPlayerHand().getCardCount() == 5) {
			setMessage("You took 5 cards without going over 21. You win!", null);
			setGameInProgress(false);
		}
		else {
			setMessage("You have " + getPlayerHand().getTwentyOneValue() + ". Hit or Stand?", null);
			setGameInProgress(true);
		}
	}

	public void doStand() {
		if (!isGameInProgress()) {
			setMessage(Strings.NEW_GAME.get(), Strings.NEW_GAME.get());
			return;
		}

		setGameInProgress(false);

		while (getDealerHand().getTwentyOneValue() <= 16 && getDealerHand().getCardCount() < 5) {
			getDealerHand().addCard(getDeck().dealCard());
		}

		if (getDealerHand().getTwentyOneValue() > 21) {
			setMessage("Dealer is bust with " + getDealerHand().getTwentyOneValue() + ". You win!", null);
		}
		else if (getDealerHand().getTwentyOneValue() < getPlayerHand().getTwentyOneValue()) {
			setMessage("Dealer has " + getDealerHand().getTwentyOneValue() + " to your " + getPlayerHand().getTwentyOneValue() + ". You win!", null);
		}
		else if (getDealerHand().getTwentyOneValue() >= getPlayerHand().getTwentyOneValue()) {
			setMessage("Dealer has " + getDealerHand().getTwentyOneValue() + " to your " + getPlayerHand().getTwentyOneValue() + ". You lose.", null);
		}
		else if (getDealerHand().getCardCount() == 5) {
			setMessage("Dealer took 5 cards without going over 21. You lose.", null);
		}
	}

	// Getters & Setters

	public boolean isGameInProgress() {
		return isGameInProgress;
	}

	private void setGameInProgress(boolean isGameInProgress) {
		this.isGameInProgress = isGameInProgress;
	}

	public Deck getDeck() {
		return deck;
	}

	private void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Hand21 getPlayerHand() {
		return playerHand;
	}

	private void setPlayerHand(Hand21 playerHand) {
		this.playerHand = playerHand;
	}

	public Hand21 getDealerHand() {
		return dealerHand;
	}

	private void setDealerHand(Hand21 dealerHand) {
		this.dealerHand = dealerHand;
	}

	public String getMessage() {
		if (message != null) {
			return message;
		}
		return "An Error Occured";
	}

	public String getTooltip() {
		if (tooltip != null) {
			return tooltip;
		}
		return "An Error Occured";
	}
	
	private void setMessage(String message, String tooltip) {
		if (message != null) {
			this.message = message;
		}
		if (tooltip != null) {
			this.tooltip = tooltip;
		}	
	}
}
