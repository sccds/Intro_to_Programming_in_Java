public class hw_1_3_18 { 
    public static void main(String[] args) { 

        // read in the command-line argument
        double n = Double.parseDouble(args[0]);
        double k = Double.parseDouble(args[1]);
        double epsilon = 1e-15;    // relative error tolerance
        double t = n;              // estimate of the square root of n
        int tolerance = 0;
        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - n/t) > epsilon * t && tolerance < 10000) {
            double y = Math.pow(t, k) - n;
            double yprime = k * Math.pow(t, k - 1);
            t = t - y / yprime;
            tolerance++;
        }
        System.out.println(epsilon);

        // print out the estimate of the square root of n
        System.out.println(t);
    }

}