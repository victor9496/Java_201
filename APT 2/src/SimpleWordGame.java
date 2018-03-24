import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SimpleWordGame {
      public int points(String[] player, 
                        String[] dictionary) {

    	  int score = 0;
    	  TreeSet<String> common = new TreeSet<String>(Arrays.asList(player));
    	  List<String> dict = Arrays.asList(dictionary); 
    	  for(String chr:common) {
    		  if(dict.contains(chr)) {
    			 score += Math.pow(chr.length(),2); 
    		  }
    	  }
    	  
    	  return score;
      }
  }