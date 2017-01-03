public class Marsaglia { 
    public static void main(String[] args) {
    	double a = Math.random();
    	double b = Math.random();
    	double x = 2 * a * Math.sqrt(1 - a * a - b * b);
    	double y = 2 * b * Math.sqrt(1 - a * a - b * b);
    	double z = 1 - 2 * (a * a + b * b);
    	System.out.println("Random point: " + x + ", " + y + ", " + z);
    }
}