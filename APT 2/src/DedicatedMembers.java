import java.util.TreeMap;
import java.util.TreeSet;

public class DedicatedMembers {
     public int[] unique(String[] clubs) {
    	 
    	 TreeMap<String, Integer> map = new TreeMap<>();
    	 //ArrayList<String> all = new ArrayList<String>();
    	 
//    	 for (String s : clubs) {
////    		 ArrayList<String> member = Arrays.asList(s.split(" "));
//// 			all.addAll(member);
//    	  all.addAll(Arrays.asList(s.split(" ")));
//    	 }
//    	 System.out.println(Arrays.toString(all.toArray()));
		for (String s : clubs) {
			String[] word = s.split(" ");
			//String[] word = new String[member.size()];
			//word = member.toArray(word);
			 //System.out.println(Arrays.toString(word.toArray()));
			TreeSet<String> set = new TreeSet<String>();
			for (int i = 0; i < word.length; i++) {
				word[i] = word[i].toLowerCase();
				set.add(word[i]);
			}

			for (String elem : set) {
				if (!map.containsKey(elem)) {
					map.put(elem, 0);
				}
				map.put(elem, map.get(elem) + 1);
			}

		}
    	 
//    	 for(String key : map.keySet()) {
//    		 System.out.println(key + map.get(key));
//    	 }
    	 
    	 int[] finans = new int[clubs.length];
//    	 System.out.println(clubs.length);
//    	 System.out.println(clubs[2]);
    	 int i =0;
    	 
    	 for(String s : clubs) {
    		String[]words =  s.split(" ");
    		//System.out.println(words);
    		TreeSet<String> set = new TreeSet<String>();
    		for (int j = 0; j < words.length; j++) {
				words[j] = words[j].toLowerCase();
				set.add(words[j]);
			}
    		//System.out.println(set);
    		int sum = 0;
    		for(String w : set) {
    			//String w = word.toLowerCase();
    			if(map.get(w) == 1) {
    				sum ++;
    			}
    		}
    		finans[i] = sum;
    		i ++;
    	 }
    	
         return finans;
     }
 }