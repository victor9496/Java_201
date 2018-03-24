import java.util.*;

public class SyllableSorting {
	public String[] sortWords(String[] words) {
		// you write code here
		class APTComp implements Comparator<String> {

			public int compare(String a, String b) {
				int x = sorted(a).length;
				int y = sorted(b).length;
				int cmp = 0;
				if (!Arrays.equals(sorted(a), sorted(b))) {
					for (int i = 0; i < x && i < y; i++) {
						cmp = sorted(a)[i].compareTo(sorted(b)[i]);
						if (cmp != 0)
							return cmp;
					}
					return unSorted(a).length - unSorted(b).length;
				} else {

					x = unSorted(a).length;
					y = unSorted(b).length;
					for (int i = 0; i < x && i < y; i++) {
						cmp = unSorted(a)[i].compareTo(unSorted(b)[i]);
						if (cmp != 0)
							return cmp;
					}
					return unSorted(a).length - unSorted(b).length;

				}
			}

		}
		Arrays.sort(words, new APTComp());
		return words;
	}

	public String[] unSorted(String word) {

		List<String> list = new ArrayList<String>();
		String s = "" + word.charAt(0);

		for (int i = 1; i < word.length(); i++) {
			if (Character.toString(word.charAt(i - 1)).matches("[aeiou]")
					&& Character.toString(word.charAt(i)).matches("[^aeiou]")) {
				list.add(s);
				s = "" + word.charAt(i);
			} else {
				s += word.charAt(i);
			}
		}
		list.add(s);
		String[] array = new String[list.size()];
		return list.toArray(array);
	}

	public String[] sorted(String word) {
		String[] order = unSorted(word);
		Arrays.sort(order);
		return order;
	}

	// class APTComp implements Comparator<String> {
	//
	// public int compare(String a, String b) {
	// int x = a.length();
	// int y = b.length();
	// int cmp = 0;
	// if(unSorted(a).equals(unSorted(b))) {
	// for(int i =0; i<x && i<y; i++) {
	// cmp = sorted(a)[i].compareTo(sorted(b)[i]);
	// if(cmp !=0) return cmp;
	// }
	// }
	// for(int i =0; i<x && i<y; i++) {
	// cmp = unSorted(a)[i].compareTo(unSorted(b)[i]);
	// if(cmp !=0) return cmp;
	// }
	// return cmp;
	//
	// }
	//
	// }

}