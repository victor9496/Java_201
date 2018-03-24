public class RemoveMin {
      public ListNode remove (ListNode list) {
          // replace statement below with code you write
	  ListNode last = list;
	  ListNode check = new ListNode(0, list);
	  ListNode before = check;
	  
	  while(check.next !=null) {
		  if(check.next.info <last.info) {
			  last = check.next;
			  //System.out.print(before);
			 before =  check;
		  }
		  check = check.next;
	  }
    	  
    	  before.next = last.next;
    	  
//    	  if(list == last) {
//    		  list = list.next;
//    	  }
//    	  
    	  return list;
      }
  }