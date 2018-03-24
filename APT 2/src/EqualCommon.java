import java.util.*;

public class EqualCommon {
     public String[] matches(String[] a1, String[] a2) {
         TreeMap<String, Integer> mapOne = new TreeMap<>();
         TreeMap<String, Integer> mapTwo = new TreeMap<>();
         TreeSet<String> set = new TreeSet<String>(Arrays.asList(a1));
         set.retainAll(Arrays.asList(a2));
         ArrayList<String> common = new ArrayList<String>();
         
         for(String s : a1) {
        	 String[] data = s.split(" ");
        	 for(String k: data) {
        	 if(!mapOne.containsKey(k)) {
        		 mapOne.put(k, 0);
        	 } 
        	 mapOne.put(k, mapOne.get(k) +1);
         }
         }
         
         for(String s : a2) {
        	 String[] data = s.split(" ");
        	 for(String k: data) {
        	 if(!mapTwo.containsKey(k)) {
        		 mapTwo.put(k, 0);
        	 } 
        	 mapTwo.put(k, mapTwo.get(k) +1);
         }
         }
         
         for(String s : set) {
        	 
        	 if(mapOne.get(s) == mapTwo.get(s)) {
        		 common.add(s);
        	 }
         }
         String[] commonArr = new String[common.size()];
         return common.toArray(commonArr);
     }
 }