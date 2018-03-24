import java.util.*;

public class UniqueNewYork {
       public int seen(String[] records) {
       HashSet<String> set = new HashSet<>();     
    	   for(String record : records) {
    		   set.addAll(Arrays.asList(record.split(",")));
    	   }
    	   return set.size(); //replace with your code
       }
   }