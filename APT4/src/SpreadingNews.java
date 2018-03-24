import java.util.ArrayList;
import java.util.Collections;

public class SpreadingNews {
	// for every person, who is his or her supervisor
	private int[] mySups;
	// for every person, who are his or her subordinates
	private ArrayList<ArrayList<Integer>> mySubs;

	public int minTime(int[] supervisors) {
		mySups = supervisors;
		mySubs = new ArrayList<>();
		for (int k = 0; k < supervisors.length; k++)
			// make space for a list for every person
			mySubs.add(new ArrayList<Integer>());
		for (int k = 0; k < supervisors.length; k++)
			if (mySups[k] != -1) {
				mySubs.get(mySups[k]).add(k);
			}
		// TODO Add one line here
		return minTime(0);
	}

	public int minTime(int bossIndex) {
		ArrayList<Integer> subTimes = new ArrayList<>();
		if (mySubs.get(bossIndex).size() == 0)
			return 0;

		for (int i : mySubs.get(bossIndex)) {
			subTimes.add(minTime(i));
		}
		Collections.sort(subTimes, Collections.reverseOrder());
		// TODO Add code here
		
		int res = 0;
		for (int i = 0; i < subTimes.size(); i++) {
			res = Math.max(res, i + 1 + subTimes.get(i));
		}

		return res;

	}

}