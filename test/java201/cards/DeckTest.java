package java201.cards;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	private Deck deck;
	
	@Before
	public void setUp() throws Exception {
		deck = new Deck();
	}

	@Test
	public void givenANewDeckWhenSizeIsCalledThenReturnNoOfCardsInDeckAs52() {
		int expectedDeckSize = 52;
		int actualDeckSize = deck.size();
		
		assertEquals("there should be 52 cards in this deck",expectedDeckSize, actualDeckSize);
	}
	
	@Test
	public void givenADeckWhenDealIsCalledWithExpectedNoOfCardsThenReturnAListOfCards() throws NoMoreCardsException, InsufficientCardsException{
		int expectedNoOfCards = 3;
		
		List<Card> cards = deck.deal(expectedNoOfCards);
		int sctualNoOfCards = cards.size();
		
		assertEquals("wrong number of cards returned",expectedNoOfCards,sctualNoOfCards);
	}

	@Test
	public void givenADeckWhenDealIsCalledWithNoOfCardsThenDeckSizeShouldBeLessNoOfCards() throws NoMoreCardsException, InsufficientCardsException{
		int noOfCards = 2;
		int expectedDeckSize = 50;
		
		deck.deal(noOfCards);
		int actualDeckSize = deck.size();
		
		assertEquals("deck size should be less number of cards dealt",expectedDeckSize,actualDeckSize);
	}
	
	//edge cases 
	//1. what happens if deck is empty
	@Test (expected = NoMoreCardsException.class)
	public void givenADeckWhenDealIsCalledAndDeckIsEmptyThenThrowNoMoreCardsException() throws NoMoreCardsException, InsufficientCardsException{
		deck.deal(52);
		deck.deal(2);
	}
	//2. contains less cards that requested
	@Test (expected = InsufficientCardsException.class)
	public void givenADeckWhenDealIsCalledAndInsufficientCardsInDeckThenThrowInsufficientCardsException() throws NoMoreCardsException, InsufficientCardsException{
		deck.deal(48);
		deck.deal(6);
	}
}
