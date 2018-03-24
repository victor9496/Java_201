import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class SortByFreqs {

	public String[] sort(String[] names) {
		class APTComp implements Comparator<String> {

			

			public int compare(String a, String b) {
					
				if(Collections.frequency(Arrays.asList(names), a) != 
						Collections.frequency(Arrays.asList(names), b)) {
					return Collections.frequency(Arrays.asList(names), b) - Collections.frequency(Arrays.asList(names), a);
				} else {
					return a.compareTo(b);
				}
			}

		}
		
		HashSet<String> set = new HashSet<String>(Arrays.asList(names));
		String[] string = set.toArray(new String[set.size()]);
		//System.out.println(Arrays.toString(string));
		Arrays.sort(string, new APTComp());
		return string;
	}
}