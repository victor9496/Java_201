

public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
    	  String have ="";
    	  int cnt = 0;
    	  for(String s: headlines) {
    		  have += s.toLowerCase();
    	  }
    	  //System.out.println(have.toCharArray());
    	  for(String m: messages) {
    		  if(check(have, m.toLowerCase())) {
    			  cnt++;
    		  }
    	  }
    	  return cnt;
	}
	public boolean check(String h, String m) {
		for(char ch = 'a'; ch <= 'z'; ch +=1) {
			if(count(h,ch) < count(m,ch)) return false;
		}
		return true;
	}
	public int count(String s, char ch) {
		int o = 0;
		for(char chr: s.toCharArray()) {
			if(chr == ch) o++;
		}
		return o;
	}
}