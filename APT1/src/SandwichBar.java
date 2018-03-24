import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
		// fill in code here
		HashSet<String> bar = new HashSet<String>(Arrays.asList(available));
		int current = 0;
		for (String s : orders) {
			HashSet<String> cs = new HashSet<String>(Arrays.asList(s.split(" ")));

			if (check(cs, bar)) {
				return current;
			} else {
				current += 1;
			}

		}
		return -1;
	}

	public boolean check(HashSet<String> cs, HashSet<String> bar) {
		for (String s : cs) {
			if (!bar.contains(s)) {
				return false;
			}
		}
		return true;
	}
}
