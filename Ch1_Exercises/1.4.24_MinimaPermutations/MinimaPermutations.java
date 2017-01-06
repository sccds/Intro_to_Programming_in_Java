public class MinimaPermutations { 
    public static void main(String[] args) {
    	int M = Integer.parseInt(args[0]);
    	int N = Integer.parseInt(args[1]);
    	int[] num = new int[N];
    	int sum = 0;

    	for (int j = 0; j < M; j++) {
	    	for (int i = 0; i < N; i++) {
	    		num[i] = 1 + (int) (Math.random() * N);
	    	}
	    	int min = num[0];
	    	int cnt = 0;
	    	for (int i = 0; i < N; i++) {
	    		if (num[i] < min) {
	    			min = num[i];
	    			cnt ++;
	    		}
	    	}
	    	sum += cnt;
    	}
    	System.out.println((double)sum / M);
    }
}