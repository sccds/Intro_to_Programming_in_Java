public class RandomWalker { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int verti = 0, hori = 0, step = 0;
        while(true) {
            if ((hori == 2 * n) || (hori == -2 * n) || (verti == 2 * n) || (verti == -2 * n)) {
                break;
            } 
            double random = Math.random();
            if (random < 0.25) {
                verti++;
                step++;
            } else if (random >= 0.25 && random < 0.5)  {
                verti--;
                step++;
            } else if (random >= 0.5 && random < 0.75) {
                hori++;
                step++;
            } else {
                hori--;
                step++;
            } 
        }
        System.out.println(step);
    }
}