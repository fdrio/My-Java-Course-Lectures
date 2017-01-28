public class Card {
	private String suit;
	private int rank;

	public Card(String suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "[" + rank  + "," + suit + "]";
	}

	@Override
	public boolean equals(Object c2) {
		if (!(c2 instanceof Card)) {
			throw new RuntimeException("Illegal argument to Card.equals()");
		}
		Card card2 = (Card) c2;
		return ((this.getSuit().equals(card2.getSuit())) && 
				(this.getRank() == card2.getRank()));
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public boolean sameSuitAs(Card card2) {
		return (this.getSuit().equals(card2.getSuit()));
	}

	public boolean sameRankAs(Card card2) {
		return (this.getRank() == card2.getRank());
	}
	 public static boolean consecutivePairExists(Card[] deck, int index) {
	    	// YOUR CODE HERE
	    	
	    		if (deck[index].sameRankAs(deck[index+1])){
	    			return true;
	    		}
	    		
	    	return false;
	    
	    }
	 public static boolean pairExists(Card[] deck){
		 for(int index =0; index<deck.length-1;index++){
			 for(int searchIndex = index +1; searchIndex< deck.length; searchIndex++){
				 if(deck[index].sameRankAs(deck[searchIndex])){
					 return true;
					 // Worst case would be there is not a pair.
				 }
			 }
		 }
		 return false;
	 }

	 public static boolean isConsecutiveStraightFlush(Card[] deck){
		 boolean truthValue = false; //Initially false
		 for (int index =0; index< deck.length-1; index++){
			 if (deck[0].sameSuitAs(deck[index+1]) && deck[index].getRank() < deck[index+1].getRank()){
				 	truthValue = true;
			 }
			 else return false;
		 }
		 return truthValue;
	 }
}


/*	public static boolean isConsecutiveStraightFlush(Card[] deck) {
		boolean flag = false;
		
    		for(int searchIndex = 0; searchIndex<deck.length-1; searchIndex++){
    			if (deck[searchIndex+1].sameSuitAs(deck[0])&&deck[searchIndex].getRank()<deck[searchIndex+1].getRank())
    			{
    				flag = true;
    				
    			}
    			else return false;// Since it is an if and only condition,  once we find one statement that it's false then 
    			// the the entire premise is also false. There is no need to keep looking.
    			//Worst-Case would be a straight flush
    			
    			
    				
    			}
    		
		
		return flag;
	}*/

//Card[] deck1 = { card2C, card2S, card2D, card3C };
//
//Card[] deck2 = { card2C, card3C, card2D};
//
//Card[] deck3 = { card2C, card3C, spadeA};
//
//Card[] straightFlush1 = { card2C, card3C, card4C, card5C, card6C};
//Card[] straightFlush2 = { cardQC, cardKC, cardAC, card2C, card3C};
//
//Card[] emptyDeck = {};