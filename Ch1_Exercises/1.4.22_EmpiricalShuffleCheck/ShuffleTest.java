public class ShuffleTest { 
    public static void main(String[] args) {
    	// Initialize card
    	String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    	String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    	String[] deck = new String[suit.length * rank.length];
    	for (int i = 0; i < suit.length; i++) 
    		for (int j = 0; j < rank.length; j++) {
    			deck[rank.length * i + j] = rank[j] + " of " + suit[i];			
    		}

    	// Shuffle
    	for (int i = 0; i < deck.length; i++) {
    		int r = i + (int) (Math.random() * (deck.length-i));
    		String t = deck[i];
    		deck[i] = deck[r];
    		deck[r] = t;
    	}

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        


    }
}