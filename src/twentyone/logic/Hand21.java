package twentyone.logic;

public class Hand21 extends Hand {
	
    public int getTwentyOneValue() {

        int value;
        boolean ace;
        int cards;

        value = 0;
        ace = false;
        cards = getCardCount();

        for (int v = 0;  v < cards; v++) {
            Card card;
            int cardValue;
            card = getCard(v);
            cardValue = card.getRankValue();
            if (cardValue > 10) {
                cardValue = 10;
            }
            if (cardValue == 1) {
                ace = true;
            }
            value = value + cardValue;
        }

        if (ace && value + 10 <= 21 ) {
        	value = value + 10;
        }
        return value;
    }
}