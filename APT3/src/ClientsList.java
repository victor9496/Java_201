import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {
	public class Person {
		String first;
		String last;

		public Person(String s) {
			first = s.split(" ")[0];
			last = s.split(" ")[1];
		}

		public String getLast() {
			return last;
		}

		public String getFirst() {
			return first;
		}
	}

	
	public String[] dataCleanup(String[] names) {
		// fill in code here
		Person[] list = new Person[names.length];
		
		for(int i= 0; i < names.length; i ++) {
			String name = names[i];
			if(name.contains(", ")) {
				String[] miss = name.split(", ");
				String full = miss[1] + " " + miss[0];
				list[i] = (new Person(full));
			} else {
				list[i] = (new Person(name));
			}
		}
		
		Comparator<Person> comp = Comparator.comparing(Person::getLast);
	    comp = comp.thenComparing(Person::getFirst);
	    Arrays.sort(list,comp);
		String[] ret = new String[list.length];
		for(int i = 0; i < list.length; i++) {
			//ret[i] = list[i].toString();
			ret[i] = list[i].getFirst() + " " + list[i].getLast();
		}
		return ret;
	}
	
}