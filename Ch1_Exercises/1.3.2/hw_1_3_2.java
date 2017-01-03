public class hw_1_3_2 {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double discriminant = b * b - 4.0 * c;
		if (discriminant < 0) {
			System.out.println("no roots.");
			return;
		} 
		if (a == 0) {
			System.out.println("a should not be zero.");
			return;
		}
		double d = Math.sqrt(discriminant);
		System.out.println((-b + d) / 2.0);
		System.out.println((-b - d) / 2.0);
	}
}