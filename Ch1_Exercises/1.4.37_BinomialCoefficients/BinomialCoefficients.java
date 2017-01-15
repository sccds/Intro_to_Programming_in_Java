public class BinomialCoefficients {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int[][] a = new int[n+1][];

		a[1] = new int[1+2];
		a[1][1] = 1;

		for (int i = 2; i <= n; i++) {
			a[i] = new int[i+2];
			for (int j = 1; j < a[i].length-1; j++) {
				a[i][j] = (a[i-1][j] + a[i-1][j-1]);
			}
		}

		int denominator = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < a[i].length-1; j++) {
				System.out.print(a[i][j] + "/" + denominator + "\t"); 
			}
			System.out.println();
			denominator += denominator;
		}
	}
}