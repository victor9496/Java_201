import java.util.Arrays;
import java.util.Comparator;


public class TheBestName {
	static class APTComp implements Comparator<String> {
		public int compare(String a, String b) {

			if(a.equals("JOHN")) return -1;
			
			if(b.equals("JOHN")) return 1;
			
			if(weight(a) != weight(b)) {
				return weight(b) - weight(a);
			} else {
				return a.compareTo(b);
			}

	}
		public int weight(String word) {
			int finSum = 0;
			for(int i = 0; i <word.length(); i++) {
				finSum += word.charAt(i) - 64;
			}
			return finSum;
		}
	}

	
	public String[] sort(String[] names) {
			Arrays.sort(names, new APTComp());
			return names;
		}  

   }