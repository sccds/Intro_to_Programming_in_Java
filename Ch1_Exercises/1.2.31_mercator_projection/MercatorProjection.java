public class MercatorProjection {
	public static void main(String[] args) {
		double lambda0 = Double.parseDouble(args[0]);
		double faiphi = Double.parseDouble(args[1]);
		double lambda = Double.parseDouble(args[2]);
		double x = lambda0 - lambda;
		double y = 1 / 2.0 * Math.log((1 + Math.sin(faiphi)) / (1 - Math.sin(faiphi)));
		System.out.println(x + " " + y);
	}
}