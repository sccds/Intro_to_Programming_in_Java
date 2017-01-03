public class hw_1_3_11 { 
    public static void main(String[] args) {
       	System.out.println("log n \tn \tn log n\tn^2 \tn^3 \t2^n");
        for (long i = 2; i <= 2048; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print('\t');             // tab character
            System.out.print(i);
            System.out.print('\t');             
            System.out.print((int) (i * Math.log(i)));
            System.out.print('\t');             
            System.out.print(i * i);
            System.out.print('\t');             
            System.out.print(i * i * i);
            System.out.print('\t');             
            System.out.print((int) Math.pow(2, i));
            System.out.println();
        }
    }
}