package java201.cards;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandTest {

	private Hand hand;
	
	@Before
	public void setUp() throws Exception {
		hand = new Hand(0);
	}

	@Test
	public void testGetNoOfCardsForHandCreatedWithTwoCards() {
		Card card1 = new Card(2,"D");
		Card card2 = new Card(10,"D");
		
		hand = new Hand(2);
		hand.addCard(card1);
		hand.addCard(card2);
		
		assertEquals(2, hand.getNoOfCards());
		assertNotNull(hand.drawCard());
		assertNotNull(hand.drawCard());
		assertNull(hand.drawCard());
	}
	
	@Test
	public void testDrawCardsForHandCreatedWithTwoCards() {
		Card card1 = new Card(2,"D");
		Card card2 = new Card(10,"D");
		
		hand = new Hand(2);
		hand.addCard(card1);
		hand.addCard(card2);
		
		assertEquals(2, hand.getNoOfCards());
		assertNotNull(hand.drawCard());
		assertNotNull(hand.drawCard());
		assertNull(hand.drawCard());
	}
	
	@After
	public void teardown(){
		hand = null;
	}

}