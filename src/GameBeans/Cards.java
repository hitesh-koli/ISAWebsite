package GameBeans;

import GameBeans.GameConstants.*;

public class Cards {

	private CardSuit suit;
	private CardValue value;
	private CardSuit trumpSuit;
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	public CardValue getValue() {
		return value;
	}
	public void setValue(CardValue value) {
		this.value = value;
	}
	public CardSuit getTrumpSuit() {
		return trumpSuit;
	}
	public void setTrumpSuit(CardSuit trumpSuit) {
		this.trumpSuit = trumpSuit;
	}
}
