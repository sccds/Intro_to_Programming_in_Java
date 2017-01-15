public class ThreeDimensionalSelfAvoidingWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);        // lattice size
        int trials = Integer.parseInt(args[1]);   // number of trials
        int deadEnds = 0;                         // trials resulting in a dead end
        int lengthSum = 0;

        // simulate trials self-avoiding walks
        for (int t = 0; t < trials; t++) {
            boolean[][][] a = new boolean[n][n][n];   // intersections visited 
            int x = n/2, y = n/2, z = n/2;                // current position
            int length = 0; 

            // repeatedly take a random step, unless you've already escaped
            while (x > 0 && x < n-1 && y > 0 && y < n-1 && z > 0 && z < n-1)  {

                // dead-end, so break out of loop
                if (a[x-1][y][z] && a[x+1][y][z] && a[x][y-1][z] && a[x][y+1][z] && a[x][y][z-1] && a[x][y][z+1]) {
                    deadEnds++;
                    break;
                } 

                // mark (x, y) as visited
                a[x][y][z] = true; 

                // take a random step to unvisited neighbor
                double r = Math.random(); 
                if (r < 0.167) {
                    if (!a[x+1][y][z])
                        x++;
                }
                else if (r < 0.333) {
                    if (!a[x-1][y][z])
                        x--;
                }
                else if (r < 0.5) {
                    if (!a[x][y+1][z])
                        y++;
                }
                else if (r < 0.667) {
                    if (!a[x][y-1][z])
                        y--;
                }
                else if (r < 0.833) {
                    if (!a[x][y][z+1])
                        z++;
                }
                else if (r < 1.00) {
                    if (!a[x][y][z-1])
                        z--;
                }
                length++;
            } 
            lengthSum += length;
        } 

        System.out.println(100*deadEnds/trials + "% dead ends"); 
        System.out.println(lengthSum/trials + " average length"); 
    } 
} 