public class Ramanujan { 
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
    	for (int a = 1; a <= n; a++) {
    		int a3 = a * a * a;
    		if (a3 > n) break;
    		for (int b = a; b <= n; b++) {
    			int b3 = b * b * b;
    			if (a3 + b3 > n) break;
    			for (int c = a + 1; c <= n; c++) {
    				int c3 = c * c * c;
    				if (c3 > a3 + b3) break;
    				for (int d = c; d <= n; d++) {
    					int d3 = d * d * d;
    					if (c3 + d3 > a3 + b3) break;
    					if (c3 + d3 == a3 + b3) {
    						System.out.println(a + " " + b + " " + c + " " + d);
    					}
    				}
    			}
    		}
    	}
    }
}