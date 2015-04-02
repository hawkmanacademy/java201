package java201.cards;

import java.util.Stack;

public class Hand {
	private int maxCards;
	private Stack<Card> cards = new Stack<Card>();

	public Hand(int maxCards) {
		this.maxCards = maxCards;
	}

	public void addCard(Card card) {
		if (card != null) {
			if (this.cards.size() < this.maxCards) {
				this.cards.add(card);
			} else {
				throw new IllegalStateException("max number of cards cannot exceed " + maxCards);
			}
		}else{
			throw new IllegalArgumentException("card cannot be null");
		}
	}

	public int getNoOfCards() {
		return cards.size();
	}

	public Card drawCard() {
		Card card = null;
		if (cards.size() > 0)
		{
			card = cards.pop();
		}
		return card;
	}
	
	public Card peek() {
		Card card = null;
		if (cards.size() > 0)
		{
			card = cards.peek();
		}
		return card;
	}

	
}
