public class hw_1_4_14 { 
    public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		boolean[] isPrime = new boolean[N+1];

		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}  
		for (int i = 2; i <= N/i; i++) {
			if (isPrime[i]) {
				for (int j = i; j <= N/i; j++) {
					isPrime[i * j] = false;
				}	
			}
		}

		for (int i = 0; i <= N; i++) {
			if (isPrime[i]) System.out.println(i);
		}

		boolean[][] matrix = new boolean[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i != j && isPrime[i] && isPrime[j]) {
					matrix[i][j] = true;
					System.out.println(i + " " + j);
				}
			}
		}

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				if (matrix[i][j]) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}    
	
    }
}