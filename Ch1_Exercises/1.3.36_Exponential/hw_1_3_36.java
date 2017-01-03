public class hw_1_3_36 { 
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double term = 1.0;
        double sum = 0.0;
        for (int i = 1; term > 0; i++) {
            sum += term;
            term *= x / i;
        }
        System.out.println(sum);
        System.out.println(Math.exp(x));
    }
}