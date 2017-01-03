public class hw_1_2_23 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		boolean res = (m >= 3 && m <= 6) && (d >= 1 && d <= 20);
		System.out.println(res);
	}
}