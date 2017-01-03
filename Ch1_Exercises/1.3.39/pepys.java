public class pepys { 
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int test1Suc = 0, test2Suc = 0; 
        for (int i = 0; i < trials; i++) {
            int test2Cnt = 0;
            for (int j = 0; j < 12; j++) {
                int r = 1 + (int) (Math.random() * 6);
                if (r == 1) {
                    test2Cnt++;
                    if (j < 6) test1Suc++;
                } 
            }
            if (test2Cnt > 2) test2Suc++;
        }
        System.out.println("Test1: " + 1.0 * test1Suc / trials);
        System.out.println("Test2: " + 1.0 * test2Suc / trials);
    }
}