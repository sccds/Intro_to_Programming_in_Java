public class InversePermutations { 
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
    	int[] num = new int[N];

    	for (int i = 0; i < N; i++) {
    		num[i] = i;
    	}
    	for (int i = 0; i < N; i++) {
    		int r = i + (int) (Math.random() * (N-i));
    		int t = num[r];
    		num[r] = num[i];
    		num[i] = t;
    	}
    	for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
    	}
    	System.out.println();

    	int[] numb = new int[num.length];
    	for (int i = 0; i < N; i++) {
			numb[i] = num[N-i-1];
    	}
    	for (int i = 0; i < N; i++) {
			System.out.print(numb[i] + " ");
    	}
    	System.out.println();
    }
}