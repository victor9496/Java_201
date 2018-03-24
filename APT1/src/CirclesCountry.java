public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        // you write code here
    	int sumDif = 0;
    	
    	 for(int i = 0; i < x.length; i++) {
    		 double distOne = Math.pow((x[i] - x1), 2) + Math.pow((y[i] - y1), 2);
    		 double distTwo = Math.pow((x[i] - x2), 2) + Math.pow((y[i] - y2), 2);
    	
    		 if((distOne < Math.pow(r[i],2)) && (distTwo > Math.pow(r[i],2)) || (distOne > Math.pow(r[i],2)) && (distTwo < Math.pow(r[i],2))){
    			 sumDif++;
    		 }
    	 }
    	 return sumDif;
    }
 }