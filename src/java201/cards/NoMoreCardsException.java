package java201.cards;

public class NoMoreCardsException extends Exception {
	public NoMoreCardsException() {
		super("there are no more cards in the deck");
	}
}
