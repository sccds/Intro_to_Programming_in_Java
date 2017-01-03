public class Chaos { 
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double x = 0.01;
        double epsilon = 1e-15;
        int t = 0;
        while(x > 0 && x < 1 && x != 1-1/r) {
            x *= r * (1 - x);
            for(int i = 0; i < (int)(x * 10); i++)
                System.out.print("*");
            System.out.println();
            t ++;
        }
        System.out.println(t);
    }
}