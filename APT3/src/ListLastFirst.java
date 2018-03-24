public class ListLastFirst {
	public ListNode move(ListNode list) {
		// replace statement below with code you write

		if (list == null ||list.next == null)
			return list;
		ListNode last = list;

		while (list.next.next != null) {
			list = list.next;
		}

		ListNode tem = list.next;
		tem.next = last;
		last = tem;
		list.next = null;
		//last.next = null;
		//tem.next = null;
		return last;
	}
}

//if (list == null || list.next == null) return list;
//
//ListNode first = list;
//while (list.next.next != null) {
//	list = list.next;
//}
//ListNode temp = list.next;
//temp.next = first;
//first = temp;
//list.next = null;
//return first;
