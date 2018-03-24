public class SumSlice {
     public int compute(int[] vals, int n) {
       int sum = 0;
       int intermediate = 0;
       for(int i =n-1; i < vals.length; i = i+n) {
    	   intermediate = vals[i];
    	   sum += intermediate;
       }
       return sum;
     }
   }