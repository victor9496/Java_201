public class ListCount {
      public int count (ListNode list) {
          int c = 0;
          while(list != null) {
        	  list = list.next;
        	  c++;
          }
	  return c;
      }
  }