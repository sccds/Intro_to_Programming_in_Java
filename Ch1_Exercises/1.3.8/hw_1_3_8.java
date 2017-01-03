public class hw_1_3_8 { 
    public static void main(String[] args) {
        for (int i = 1000, cnt = 1; i <= 2000; i++, cnt++) {
            if (cnt % 5 == 0) System.out.println(i);
            else System.out.print(i + " ");
        }
    }
}