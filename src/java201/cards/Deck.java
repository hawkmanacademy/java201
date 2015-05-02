package java201.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Deck {
	
	private Stack<Card> cards;
	
	private List<Card> dealt;
	
	public Deck() {
		cards = new Stack<Card>();
		dealt = new ArrayList<Card>();
		for (Suite suite:Suite.values()){
			for(Rank rank:Rank.values()){
				Card card = new Card(suite,rank);
				cards.add(card);
			}
		}
	}

	public int size() {
		return cards.size();
	}
	
	private Card deal() throws NoMoreCardsException{	
		Card card = cards.pop();
		dealt.add(card);
		return card;
	}

	public List<Card> deal(int noOfCards) throws NoMoreCardsException, InsufficientCardsException {
		validateDeck(noOfCards); 
		
		List<Card> cardsToGet = new ArrayList<Card>();	
		while (cardsToGet.size() < noOfCards){
			cardsToGet.add(deal());
		}
		
		return cardsToGet;
	}

	private void validateDeck(int noOfCards) throws NoMoreCardsException,
			InsufficientCardsException {
		if (cards.size() == 0){
			throw new NoMoreCardsException();
		}
		
		if (cards.size() < noOfCards){
			throw new InsufficientCardsException(noOfCards, cards.size());
		}
	}

}
