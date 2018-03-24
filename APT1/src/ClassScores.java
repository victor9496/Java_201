import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassScores {

	public int[] findModeFast(int[] scores) {
		int[] counts = new int[101];
		int modeCount = 0;
		int maxOccurrences = 0;
		for (int elem : scores) {
			counts[elem] += 1;
			if (counts[elem] > maxOccurrences) {
				maxOccurrences = counts[elem];
				modeCount = 1;
			} else if (counts[elem] == maxOccurrences) {
				modeCount += 1;
			}
		}

		int[] ret = new int[modeCount];
		int index = 0;
		for (int s = 0; s <= 100; s++) {
			if (counts[s] == maxOccurrences) {
				ret[index] = s;
				index += 1;
			}
		}
		return ret;

		// What does counts[k] contain?
		// What is maxOccurences and modeCount?
		// TODO: complete findMode to not return empty array
	}
	
	
	public int[] findMode(int[] scores) {
		return findModeFast(scores);
	}

	/**
	 * Returns the "mode" of a set of data points: the most common value(s)
	 * 
	 * @param in
	 *            legal (i.e., non-null) input where each token is a integer
	 * @return mode of the set of scores. In the case of more than one number, they
	 *         should be returned in increasing order.
	 */
	public int[] findMode(Scanner in) {
		// TODO: complete findMode for a file
		
		// FIX: returning empty array
		return new int[0];
	}

	public static void main(String[] args) throws FileNotFoundException {
		int[] example = { 88, 70, 65, 70, 88 };

		// TODO: Call mode


		// TODO: Call selectFile to choose File to open for reading
		// and then construct a Scanner
		/*Scanner in = new Scanner(FileSelector.selectFile());
		readAndPrintFile(in);*/
		// TODO: Call readAndPrintFile to print contents

		// TODO: test out mode implementations
		ClassScores c = new ClassScores();
		int[] result = c.findMode(example);
		System.out.println(Arrays.toString(result));

	} 


}