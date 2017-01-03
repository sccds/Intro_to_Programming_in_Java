public class RGBtoCMYK {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		double w, c, m, y, k;
		if (r == 0 && g == 0 && b == 0) {
			c = 0;
			m = 0;
			y = 0;
			k = 1;
		} else {
			w = Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));
			c = (w - r / 255.0) / w;
			m = (w - g / 255.0) / w;
			y = (w - b / 255.0) / w;
			k = 1 - w;
		}
		System.out.println(c);
		System.out.println(m);
		System.out.println(y);
		System.out.println(k);
	}
}