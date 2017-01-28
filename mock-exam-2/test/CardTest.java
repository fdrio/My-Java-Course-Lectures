import static org.junit.Assert.*;
import org.junit.Test;

public class CardTest {
	
	Card diamond1 = new Card("Diamond", 1);
	Card diamond2 = new Card("Diamond", 2);
	Card spade1 = new Card("Spade", 1);
	Card spade2 = new Card("Spade", 2);
	Card spadeA = new Card("Spade", 14);
	
        Card card2C = new Card("Club", 2);
        Card card2S = new Card("Spade", 2);
        Card card2D = new Card("Diamond", 2);
        Card card2H = new Card("Heart", 2);

        Card card3C = new Card("Club", 3);
        Card card4C = new Card("Club", 4);
        Card card5C = new Card("Club", 5);
        Card card6C = new Card("Club", 6);
        Card card7C = new Card("Club", 7);
        Card card8C = new Card("Club", 8);
        Card card9C = new Card("Club", 9);
        Card card10C = new Card("Club", 10);
        Card cardJC = new Card("Club", 11);
        Card cardQC = new Card("Club", 12);
        Card cardKC = new Card("Club", 13);
        Card cardAC = new Card("Club", 14);
    
        Card[] deck1 = { card2C, card2S, card2D, card3C };
    
        Card[] deck2 = { card2C, card3C, card2D};
 
        Card[] deck3 = { card2C, card3C, spadeA};
    
        Card[] straightFlush1 = { card2C, card3C, card4C, card5C, card6C};
        Card[] straightFlush2 = { cardQC, cardKC, cardAC, card2C, card3C};

        Card[] emptyDeck = {};

	@Test
	public void testToString() {
		assertTrue("Card.toString: generates incorrect String", diamond1.toString().equals("[1,Diamond]"));
		assertTrue("Card.toString: generates incorrect String", spade2.toString().equals("[2,Spade]"));
	}
	
	@Test
	public void testEquals() {
		assertTrue("Card.equals: Yields false incorrectly", diamond1.equals(diamond1));
		assertFalse("Card.equals: Yields true incorrectly", diamond1.equals(diamond2));
	}

	@Test
	public void testSameSuitRank() {
		assertTrue("Card.sameRankAs: Yields false incorrectly", diamond1.sameRankAs(spade1));
		assertTrue("Card.sameSuitAs: Yields false incorrectly", diamond1.sameSuitAs(diamond2));
		assertFalse("Card.sameRankAs: Yields tr	ue incorrectly", spade1.sameRankAs(spade2));
		assertFalse("Card.sameSuitAs: Yields true incorrectly", spade2.sameSuitAs(diamond1));
	}

	@Test
	public void testIsConsecutiveStraightFlush() {
		assertFalse("isConsecutiveStraightFlush: returns true incorrectly", Card.isConsecutiveStraightFlush(emptyDeck));
		assertFalse("isConsecutiveStraightFlush: returns true incorrectly", Card.isConsecutiveStraightFlush(deck1));
		assertTrue("isConsecutiveStraightFlush: returns false incorrectly", Card.isConsecutiveStraightFlush(straightFlush1));
		//assertTrue("isConsecutiveStraightFlush: returns false incorrectly", Card.isConsecutiveStraightFlush(straightFlush2));
	}
}