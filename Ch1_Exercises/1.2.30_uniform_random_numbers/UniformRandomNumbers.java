public class UniformRandomNumbers {
	public static void main(String[] args) {
		double a1 = Math.random();
		double a2 = Math.random();
		double a3 = Math.random();
		double a4 = Math.random();
		double a5 = Math.random();
		double max = Math.max(a5, Math.max(a4, Math.max(a3, Math.max(a2, a1))));
		double min = Math.min(a5, Math.min(a4, Math.min(a3, Math.min(a2, a1))));
		double avg = (a1 + a2 + a3 + a4 + a5) / 5;
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}
}