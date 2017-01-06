public class HadamardMatrix { 
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
        boolean[][] hadamard = new boolean[N][N];

        hadamard[0][0] = true;
        for (int k = 1; k < N; k+=k) {
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    hadamard[i+k][j] = hadamard[i][j];
                    hadamard[i][j+k] = hadamard[i][j];
                    hadamard[i+k][j+k] = !hadamard[i][j];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (hadamard[i][j]) System.out.print("T ");
                else                System.out.print("F ");
            }
            System.out.println();
        }
    }
}