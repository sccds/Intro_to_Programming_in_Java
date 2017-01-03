public class hw_1_3_14 { 
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long i = 1; i <= n / 2; i++) {
            long res = i * i;
            if (res <= n) {
                System.out.println(res);
            }
        }
    }
}