public class Kary { 
    public static void main(String[] args) { 

        // read in the command-line argument
        long n = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n / k) {
            power *= k;
        }
  
        // check for presence of powers of k in n, from largest to smallest
        while (power > 0) {

            // power is not present in n 
            if (n < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                int coef = 1;
                while (coef * power <= n) {
                    coef++;
                }
                coef -= 1;
                if (coef >= 10) {
                    switch(coef % 10) {
                        case 0: System.out.print("A"); break;
                        case 1: System.out.print("B"); break;
                        case 2: System.out.print("C"); break;
                        case 3: System.out.print("D"); break;
                        case 4: System.out.print("E"); break;
                        case 5: System.out.print("F"); break;
                    }
                }
                else {
                    System.out.print(coef);
                }
                n -= coef * power;
            }

            // next smallest power of k
            power /= k;
        }
        System.out.println();
    }

}