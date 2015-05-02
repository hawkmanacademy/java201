package java201.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {

	private static final List<String> SUITES = Collections.unmodifiableList(Arrays.asList("D","C","H","S"));
	
	private  int rank;
	
	private  String suite;

	public Card(int rank, String suite) {
		
		validateRank(rank);
		this.rank = rank;
		
		validateSuite(suite);
		this.suite = suite;
	}

	public Card(Suite suite, Rank rank) {
		this(rank.intvalue(),suite.name().charAt(0) +"");
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		validateRank(rank);
		this.rank = rank;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		validateSuite(suite);
		this.suite = suite;
	}
	
	private void validateSuite(String suite) {
		if (SUITES.contains(suite) == false){
			throw new IllegalArgumentException("invalid suite " + suite);
		}
	}

	private void validateRank(int rank) {
		if (rank < 2 || rank > 14){
			throw new IllegalArgumentException("invalid rank " + rank);
		}
	}
	
}
