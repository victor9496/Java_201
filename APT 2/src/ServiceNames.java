import java.util.*;
public class ServiceNames {
	public String[] makeList(String[] services) {
		TreeMap<String, TreeSet<String>> map = new TreeMap<>();
		for (String ser : services) {
			String[] data = ser.split(" ");

			for (int i = 1; i < data.length; i++) {
				String word = data[i];
				if (!map.containsKey(word)) {
					TreeSet<String> results = new TreeSet<>();
					results.add(data[0]);
					map.put(word, results);
				} 
				else {
				TreeSet<String> s1 = new TreeSet<String>(); 
				s1.addAll(map.get(word));
				s1.add(data[0]);
				map.put(word, s1);	
				}
			}
		}

		ArrayList<String> finalAns = new ArrayList<>();
		for(String s: map.keySet()) {
			String a = s + " ==> ";
			String b = String.join(", ", map.get(s));
			finalAns.add(a + b);
		}
		return finalAns.toArray(new String[0]);
	}
}