public class DoubleList {
      public ListNode bigify(ListNode list) {
          // replace statement below with code you write
          
    	  ListNode last = list;
    	  while(list != null) {
    		 ListNode newNode = new ListNode(list.info, list.next);
    		 list.next = newNode;
    		 list = list.next.next;
    	  }
    	  return last;
      }
  }