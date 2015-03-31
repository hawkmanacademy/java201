package java201.cards;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private Card card;
	
	@Before
	public void setUp() throws Exception {
		card = new Card(2,"D");
	}

	@Test
	public void testCreateCardSuceeds() {
		int expectedRank = 2;
		String expectedSuite = "H";
		
		card.setRank(expectedRank);
		card.setSuite(expectedSuite);
		
		assertEquals(expectedRank,card.getRank());
		assertEquals(expectedSuite,card.getSuite());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createCardWithInvalidRankFails(){
		int expectedRank = 24;
		String expectedSuite = "H";
		
		card.setRank(expectedRank);
		card.setSuite(expectedSuite);
		
		assertEquals(expectedRank,card.getRank());
		assertEquals(expectedSuite,card.getSuite());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void createCardWithInvalidSuiteFails(){
		int expectedRank = 2;
		String expectedSuite = "Z";
		
		card.setRank(expectedRank);
		card.setSuite(expectedSuite);
		
		assertEquals(expectedRank,card.getRank());
		assertEquals(expectedSuite,card.getSuite());
	}
	
	@After
	public void teardown(){
		card = null;
	}

}
