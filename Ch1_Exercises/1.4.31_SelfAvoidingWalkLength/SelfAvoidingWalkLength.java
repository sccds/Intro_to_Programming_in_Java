public class SelfAvoidingWalkLength {
    public static void main(String[] args) {
        int n = 10000;        // lattice size
        int trials = Integer.parseInt(args[0]);   // number of trials
        int sum = 0;
        

        // simulate trials self-avoiding walks
        for (int t = 0; t < trials; t++) {
            int length = 0; 
            boolean[][] a = new boolean[n][n];   // intersections visited 
            int x = n/2, y = n/2;                // current position

            // repeatedly take a random step, unless you've already escaped
            while (x > 0 && x < n-1 && y > 0 && y < n-1)  {

                // dead-end, so break out of loop
                //if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) {
                //    break;
                //} 

                // mark (x, y) as visited
                a[x][y] = true; 

                // take a random step to unvisited neighbor
                double r = Math.random(); 
                if (r < 0.25) {
                    if (!a[x+1][y])
                        x++;
                }
                else if (r < 0.50) {
                    if (!a[x-1][y])
                        x--;
                }
                else if (r < 0.75) {
                    if (!a[x][y+1])
                        y++;
                }
                else if (r < 1.00) {
                    if (!a[x][y-1])
                        y--;
                }
                length++;

            } 
            sum += length;
        } 

        System.out.println(sum/trials + " average length"); 
    } 
} 