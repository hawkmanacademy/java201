package java201.cards;

public class InsufficientCardsException extends Exception {
	public InsufficientCardsException(int requested,int available) {
		super("attempted to deal " + requested +  " cards but only " + available + " are available in the deck");
	}
}
