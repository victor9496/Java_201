import java.util.*;

/**
 * Name: YOUR NAME HERE Course: CompSci 201 Problem: Discussion 3 Date: February
 * 5, 2018 Purpose: Solve a problem by applying some set operations
 */

public class Thesaurus {
	/**
	 * Converts the elements of a String to a set. The format of a n-word String
	 * should be "word1 word2 word3... wordn" That is, each word should be separated
	 * by exactly one space and there should be no leading or trailing spaces.
	 * 
	 * @param s
	 *            words with individual spaces separating words
	 * @return elements of s as a Set
	 */
	public Set<String> sToSet(String s) {
		// TODO: complete sToSet
		Set<String> s1 = new TreeSet<String>(Arrays.asList(s.split(" ")));
		return s1;
	}

	/**
	 * Converts the elements in a collection to a space-separated list. That is, if
	 * the collection contains [A, B, C, D], the method should return "A B C D".
	 * There should be no leading or trailing spaces
	 * 
	 * @return the elements of elems as a space-separated String
	 */
	public String collToS(Collection<String> elems) {
		// TODO: complete collToS

		String els = "";
		for (String i : elems) {
			if (els == "") {
				els = els + i;
			} else {
				els = els + " " + i;
			}
		}
		return els;
	}

	/**
	 * Returns the number of elements contained in both sets. The sets passed in
	 * should not be changed.
	 * 
	 * @param a
	 *            a set of words
	 * @param b
	 *            another set of words
	 * @return number of elements in common to a and b
	 */
	public int numInCommon(Set<String> a, Set<String> b) {
		// TODO: complete numInCommon
		TreeSet<String> common = new TreeSet<>(a);
		common.retainAll(b);
		return common.size();
	}

	/**
	 * Creates a new set that is the union of the given sets. The union of two sets
	 * is the set that contains all of the elements of both sets. The sets passed in
	 * should not be changed.
	 *
	 * @param a
	 *            a set of words
	 * @param b
	 *            another set of words
	 * @return union of sets a and b
	 */
	public Set<String> union(Set<String> a, Set<String> b) {
		// TODO: test union
		TreeSet<String> results = new TreeSet<>(a);
		results.addAll(b);
		return results;
	}

	/**
	 * Creates an edited version of Thesaurus entries.
	 * 
	 * If any two entries have 2 or more words in common then they should be
	 * combined into a single entry. The final Thesaurus must contain no pair of
	 * entries that have 2 or more words in common. Each entry must contain no
	 * duplicates. The words within each element of the returned value must be in
	 * alphabetical order, and the elements must appear in alphabetical order
	 * 
	 * @param entry
	 *            each element is a list of words that are all synonyms
	 * @return edited version of Thesaurus entries
	 */
	@SuppressWarnings("unchecked")
	public String[] edit(String[] entry) {
		// TODO: Convert entry from array of Strings to ArrayList of Sets

		@SuppressWarnings("rawtypes")
		ArrayList<Set> newEntry = new ArrayList<Set>();
		for (int i = 0; i < entry.length; i++) {
			Set<String> current = sToSet(entry[i]);
			newEntry.add(current);
		}
		// TODO: Create edited version of entries
		for (int j = 0; j < newEntry.size(); j++) {
			for (int k = j + 1; k < newEntry.size(); k++) {
				if (numInCommon(newEntry.get(j), newEntry.get(k)) >= 2) {
					Set<String> combine = union(newEntry.get(j), newEntry.get(k));
					newEntry.add(combine);
					newEntry.remove(j);
					newEntry.remove(k - 1);
					j = 0;
					k = 0;
				}
			}
		}

		String[] finalAns = new String[newEntry.size()];
		ArrayList<String> endResult = new ArrayList<String>();

		for (int i = 0; i < newEntry.size(); i++) {
			String newString = collToS(newEntry.get(i));
			endResult.add(newString);
		}
		// TODO: Sort entries in alphabetical order
		Collections.sort(endResult);
		finalAns = endResult.toArray(finalAns);

		return finalAns;
	}

	public static void main(String[] args) {
		Thesaurus t = new Thesaurus();
		String[][] inputs = { { "ape monkey wrench", "wrench twist strain", "monkey twist frugue strain" },
				{ "C B A", "F D E", "I G H", "B G C E F" } };
		for (String[] input : inputs)
			System.out.println(Arrays.toString(t.edit(input)));
		// TODO: add more tests
	}
}