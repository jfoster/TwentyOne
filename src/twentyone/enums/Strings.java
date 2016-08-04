package twentyone.enums;

public enum Strings {
	WIN("You win!"),
	LOSE("You lose."),
	DEALER_BLACKJACK(""),
	PLAYER_BLACKJACK(""),
	NEW_GAME("Press [New Game] to start a new game."),
	HIT_OR_STAND("Press [Hit] or [Stand]."),
	DEALER_HAS("Dealer has "),
	YOU_HAVE("You have "),
	;
	
	private String string;
	
	private Strings(String string) {
		this.string = string;
	}
	
	public String get() {
		return string;
	}
}
