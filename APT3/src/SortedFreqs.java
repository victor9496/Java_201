import java.util.*;

public class SortedFreqs {
      public int[] freqs(String[] data) {
       TreeSet<String> set = new TreeSet<>(Arrays.asList(data));
       int[] finAns = new int[set.size()];
       
       int index = 0;
       
       for(String s: set) {
    	   finAns[index] = Collections.frequency(Arrays.asList(data), s);
    	   index ++;
       }
       return finAns;
      }
   }