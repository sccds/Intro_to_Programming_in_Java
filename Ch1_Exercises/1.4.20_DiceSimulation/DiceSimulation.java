public class DiceSimulation { 
    public static void main(String[] args) {
		double[] dist = new double[13];
		for(int i = 1; i <= 6; i++) 
			for (int j = 1; j <= 6; j++) 
				dist[i+j] += 1.0;

		for (int k = 1; k <= 12; k++) 
			dist[k] /= 36.0;  

		for (int i = 0; i <= 12; i++) 
			System.out.println(i + ": " + dist[i] + " ");
		System.out.println();

		int N = Integer.parseInt(args[0]);
		double[] simulation = new double[13];

		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < 2; j++) {
				sum += 1 + (int) (Math.random() * 6);
			}
			simulation[sum] += 1.0;
		}

		for (int i = 0; i <= 12; i++) 
			simulation[i] /= N;

		for (int i = 0; i <= 12; i++) 
			System.out.println(i + ": " + simulation[i] + " ");
		System.out.println();
    }
}