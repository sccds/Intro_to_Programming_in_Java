public class hw_1_2_19 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double r = Math.random();
		int result;
		if (r >= 0.5){
			result = b;
		}
		else {
			result = a;
		}
		System.out.println(result);
	}
}