public class BridgeHands {
	public static void main(String[] args) {
    	// Initialize card
    	String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    	String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    	String[] deck = new String[suit.length * rank.length];
    	for (int i = 0; i < suit.length; i++) 
    		for (int j = 0; j < rank.length; j++) {
    			deck[rank.length * i + j] = suit[i];			
    		}

    	// Shuffle
    	for (int i = 0; i < deck.length; i++) {
    		int r = i + (int) (Math.random() * (deck.length-i));
    		String t = deck[i];
    		deck[i] = deck[r];
    		deck[r] = t;
    	}

    	// statistic distribution of number of cards in each suit
    	int[][] hands = new int[4][4];
    	for (int i = 0; i < deck.length; i++) {
    		if (deck[i] == "Clubs") 	hands[i%4][0]++;
    		if (deck[i] == "Diamonds")	hands[i%4][1]++;
    		if (deck[i] == "Hearts") 	hands[i%4][2]++;
    		if (deck[i] == "Spades")	hands[i%4][3]++;
    	}
    	for (int i = 0; i < 4; i++) {
    		System.out.println("Clubs-Diamonds-Hearts-Spades: " + 
    							hands[i][0] + "-" + hands[i][1] + "-" + hands[i][2] + "-" +hands[i][3]);
    	}
	}
}



