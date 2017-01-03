public class PrimeCounter { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int cnt = 0;
        boolean notPrime[] = new boolean[n + 1];
        notPrime[0] = notPrime[1] = true;

        for (int i = 2; i <= n / i; i++) {
            System.out.println("i: " + i);
            if (!notPrime[i]) {
                for (int j = i; j <= n / i; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!notPrime[i]) cnt++;
        }

        System.out.println(cnt);
    }
}