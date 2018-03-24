
public class LaserShooting {
	public double numberOfHits(int[] x, int[] y1, int[] y2) {
		double prob = 0;
		double sumprob = 0;		
		
		for (int i = 0; i < x.length; i++) {
			double y1D = y1[i];
			double y2D = y2[i];
			//when y2 is closer to x-axis
			 if (y1[i] > y2[i]) {
				prob = (Math.atan(y1D/x[i]) - Math.atan(y2D/x[i])) / Math.PI;
				//when y1 is closer to x-axis
			} else if (y2[i] > y1[i]) {
				prob = (Math.atan(y2D/x[i]) - Math.atan(y1D/x[i])) / Math.PI;
			} else {
				prob = 0;
			}

			//sum the total probability each time
			sumprob += prob;
		}

		return sumprob;
	}
}