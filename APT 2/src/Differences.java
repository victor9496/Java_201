import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Differences {
     public String[] matches(String[] a, String[] b) {
    	     TreeMap<String, Integer> mapOne = new TreeMap<>();
         TreeMap<String, Integer> mapTwo = new TreeMap<>();
         TreeSet<String> set = new TreeSet<String>();
//         TreeSet<String> set = new TreeSet<String>(Arrays.asList(a));
//         set.retainAll(Arrays.asList(b));
         ArrayList<String> common = new ArrayList<String>();
         
         
         for(String record: a) {
        	 set.addAll(Arrays.asList(record));
         }
         
         for(String record: b) {
        	 set.addAll(Arrays.asList(record));
         }
        
         for(String s : a) {
        	 if(!mapOne.containsKey(s)) {
        		 mapOne.put(s, 0);
        	 } 
        	 mapOne.put(s, mapOne.get(s) +1);
         }
         
         for(String s : b) {
        	 if(!mapTwo.containsKey(s)) {
        		 mapTwo.put(s, 0);
        	 } 
        	 mapTwo.put(s, mapTwo.get(s) +1);
         }
         
         for(String s: set) {
        	 int i = 0;
        	 if(!mapOne.containsKey(s)) {
        		 continue;
        	 } else if(!mapTwo.containsKey(s)) {
        		 i = mapOne.get(s);
        	 } else {
        	 
        	 i = mapOne.get(s) - mapTwo.get(s);
        	 }
        	 
        	 String sTwo = s + " ==> " + i;
        	 common.add(sTwo);
         }
         String[] commonArr = new String[common.size()];
         return common.toArray(commonArr);
     }
 }