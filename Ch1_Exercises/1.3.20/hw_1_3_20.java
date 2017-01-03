public class hw_1_3_20 { 
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String s = "";
        for (int i = n; i > 0; i /= k) {
            int coef = i % k;
            if (coef >= 10) {
                switch(coef % 10) {
                    case 0: s = "A" + s; break;
                    case 1: s = "B" + s; break;
                    case 2: s = "C" + s; break;
                    case 3: s = "D" + s; break;
                    case 4: s = "E" + s; break;
                    case 5: s = "F" + s; break;
                }
            } else {
                s = coef + s;
            }
        }
        System.out.println(s);
    }

}