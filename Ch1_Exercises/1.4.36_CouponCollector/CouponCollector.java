public class CouponCollector {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int trial = Integer.parseInt(args[1]);
		boolean[] a = new boolean[n+1];
		int cnt = 0, add = 0, sum = 0;
		int r;

		double formular = 0.0;
		for (double i = 1; i <= n; i++) {
			formular += 1 / i;
		}
		formular *= n;

		for (int t = 0; t < trial; t++) {
			while(add < a.length-1) {
				r = 1 + (int) (Math.random() * n);
				if (!a[r]) {
					a[r] = true;
					add++;
				}
				cnt++;
			}	
			sum += cnt;		
		}

		System.out.println("cnt average: " + (double) sum / trial);
		System.out.println("formular: " + formular);
	}
}



