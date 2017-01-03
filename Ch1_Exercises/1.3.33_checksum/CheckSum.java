public class CheckSum { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;
            sum += i * digit;
            n /= 10;
        }
        if (sum % 11 == 0) System.out.println(args[0] + "0");
        else if (sum % 11 == 1) System.out.println(args[0] + "X");
        else System.out.println(args[0] + (11 - sum % 11));
    }
}