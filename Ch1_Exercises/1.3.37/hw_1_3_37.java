public class hw_1_3_37 { 
    public static double talorSin(double x) {
        double term = x;
        double sum = 0.0;
        for (int i = 3; sum != sum + term; i+=2) {
            sum += term;
            term *= -1 * x * x / (i * (i-1));
        }
        return sum;
    }
    public static double talorCos(double x) {
        double term = 1.0;
        double sum = 0.0;
        for (int i = 2; sum != sum + term; i+=2) {
            sum += term;
            term *= -1 * x * x / (i * (i-1));
        }
        return sum;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println(Math.sin(x) + " " + talorSin(x));
        System.out.println(Math.cos(x) + " " + talorCos(x));
    }
}