public class FindDuplicate { 
    public static void main(String[] args) {
    	int N = Integer.parseInt(args[0]);
    	int[] num = new int[N];

    	for (int i = 0; i < N; i++) {
    		num[i] = (int) (Math.random() * N);
    	}
    	for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
    	}
    	System.out.println();

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (num[i] == num[j]) {
                    System.out.println("Find Duplicate: Index: " + i + " " + j + " , number: " + num[i]);
                }
            }
        }
    }
}