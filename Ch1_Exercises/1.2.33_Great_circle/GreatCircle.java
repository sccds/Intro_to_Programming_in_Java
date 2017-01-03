public class GreatCircle {
	public static void main(String[] args) {
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double y1 = Math.toRadians(Double.parseDouble(args[1]));
		double x2 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));
		double d = 60 * Math.toDegrees(Math.acos(Math.sin(x1) * Math.sin(x2) +
								  Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println(d);
	}
}

/*
  % java GreatCircle 59.9 -30.3 37.8 122.4        // Leningrad to SF
 *  4784.369673474519 nautical miles
 *
 *  % java GreatCircle 48.87 -2.33 30.27 97.74      // Paris to Austin
 *  4423.14075970742 nautical miles
 * 
 *  % java GreatCircle 36.12 -86.67 33.94 -118.4    // Nashville airport (BNA) to LAX
 *  1557.50511103695 nautical miles
 *
 *  % java GreatCircle 40.35 74.65 48.87 -2.33      // Princeton to Paris
 *  3185.1779271158425 nautical miles
*/