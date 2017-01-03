public class hw_1_3_4 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		boolean x_res = x > 0 && x < 1;
		boolean y_res = y > 0 && y < 1;
		System.out.println(x_res && y_res);
	}
}