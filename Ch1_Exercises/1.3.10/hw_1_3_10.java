public class hw_1_3_10 { 
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
    	String ruler = " ";
    	for (int i = 1; i <= n; i++) {
    		ruler = ruler + i + ruler;
    	}
    	System.out.println(ruler);
    }
}