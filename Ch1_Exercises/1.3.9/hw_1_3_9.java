public class hw_1_3_9 { 
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
    	double sum = 0;
    	for (int i = 0; i < n; i++) {
    		sum += Math.random();
    	}
    	System.out.println(sum / n);
    }
}