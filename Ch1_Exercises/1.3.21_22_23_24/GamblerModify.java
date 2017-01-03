
public class GamblerModify { 

    public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]);    // number of trials to perform
        double winProb = Double.parseDouble(args[3]);   // fixed probability that the gambler wins each bet
        int maxBet = Integer.parseInt(args[4]);     // number of bets the gambler is willing to make

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash;
            int numBet;
            for (cash = stake, numBet = 0; cash > 0 && cash < goal; bets++, numBet++) {
                if (numBet > maxBet) {
                    System.out.println("Runs out of time!");
                    break;
                } 
                if (Math.random() < winProb) cash++;     // win $1
                else                         cash--;     // lose $1
                for (int i = 0; i < cash; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
            System.out.println("Current cash = " + cash);
            System.out.println();
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}