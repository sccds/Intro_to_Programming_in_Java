public class hw_1_2_24 {
	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		double P = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		double res = P * Math.exp(r * t);
		System.out.println(res);
	}
}