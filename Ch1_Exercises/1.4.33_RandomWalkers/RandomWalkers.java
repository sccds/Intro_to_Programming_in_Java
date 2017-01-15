public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        // lattice size
        int trail = Integer.parseInt(args[1]);
        int[] x = new int[n];
        int[] y = new int[n];
        double sum = 0;
        boolean[][] visited = new boolean[n][n];
        int cellsToVisit = n * n;

        for (int t = 0; t < trail; t++) {
            int steps = 0;
            for (int i = 0; i < n; i++) {
                x[i] = n / 2;
                y[i] = n / 2;
            }

            visited[n/2][n/2] = true;
            cellsToVisit--;

            while (cellsToVisit > 0) {
                steps++;

                for (int i = 0; i < n; i++) {

                    double r = Math.random();
                    if (r < 0.25)       x[i]++;
                    else if (r < 0.5)   x[i]--;
                    else if (r < 0.75)  y[i]++;
                    else if (r < 1)     y[i]--;

                    if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
                        cellsToVisit--;
                        visited[x[i]][y[i]] = true;
                    }

                }

            }    
            sum += steps;        
        }
        System.out.println(sum / trail+ " average steps.");
    } 
} 