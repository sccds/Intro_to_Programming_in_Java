public class MusicShuffling { 
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = i;
        }
        int bad = 0;
        int trials = 1000000;

        for (int t = 0; t < trials; t++) {
            for (int i = 0; i < N; i++) {
                int r = i + (int) (Math.random() * (N - i));
                int tmp = num[r];
                num[r] = num[i];
                num[i] = tmp;   
            }
            for (int i = 1; i < N; i++) {
                if (num[i-1] == num[i] - 1) {
                    bad++;
                    break;
                }
            }
        }
        System.out.println(100*bad/trials + "% bad shuffle.");

    }
}