public class hw_1_3_44 { 
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long a, b, c, d, e;
        for (a = 1; a <= n; a++) {
            for (b = a; b < n; b++) {
                for (c = b; c < n; c++) {
                    for (d = c; d < n; d++) {
                        for (e = d; e < n; e++) {
                            //System.out.println(a + " " + b + " " + c + " " + d + " " + e);
                            if (a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d == e*e*e*e*e) {
                                System.out.println(a + " " + b + " " + c + " " + d + " " + e);
                            }
                        }
                    }
                }
            }
        }
    }
}