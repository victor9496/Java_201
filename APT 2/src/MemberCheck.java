import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;


public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
             // TODO: fill in code here
    	  Set<String> s1 = new HashSet<String>(Arrays.asList(club1)); 
    	  Set<String> s2 = new HashSet<String>(Arrays.asList(club2)); 
    	  Set<String> s3 = new HashSet<String>(Arrays.asList(club3)); 
    	  
    	  Set<String> result = new TreeSet<>();
    		
    	   	result.addAll(intersection(s1,s2));
    	   	result.addAll(intersection(s1,s3));
    	   	result.addAll(intersection(s2,s3));
    	   	
    	   	return result.toArray(new String[0]);
      }
      public Set<String> intersection(Set<String> a, Set<String> b) {
    	  
    	         Set<String> c = new TreeSet<String> ();
    	         c.addAll(a);
    	         c.retainAll(b);
    	         return c;
      }
   }