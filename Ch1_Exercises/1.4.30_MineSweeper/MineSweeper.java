public class MineSweeper { 
    public static void main(String[] args) {
    	int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        boolean[][] map = new boolean[M+2][N+2];

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = Math.random() < p;
            }
        }

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == true)  System.out.print("* ");
                else                    System.out.print(". ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == false) {
                    int cnt = 0;
                    for (int ii = i-1; ii <= i+1; ii++) {
                        for (int jj = j-1; jj <= j+1; jj++) {
                            if (map[ii][jj]) cnt++;
                        }
                    }
                    System.out.print(cnt + " ");
                }
                else System.out.print("* ");
           }
           System.out.print("\n");
        }
    }
}