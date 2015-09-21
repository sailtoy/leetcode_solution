package leetcode_solutions;

public class Problem_019 {
	
	public static void main(String[] args) {
		Problem_019 p = new Problem_019();
		ListNode head = new ListNode(1);
		
		/*ListNode m = head;
		for (int i = 2; i <= 5 ; i++) {
			m.next = new ListNode(i);
			m = m.next;
		}*/
		p.printList(head);
		ListNode h = p.removeNthFromEnd(head, 1);
		p.printList(h);
		
	}
	
	public void printList(ListNode head){
		while(head != null){
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println();
	}
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode rhead = new ListNode(-111111);
		rhead.next = head;
		ListNode t = rhead;
		ListNode f = rhead;
		for (int i = 0; i < n && t != null; i++) {
			t = t.next;
		}
		while(t != null && t.next != null){
			t = t.next;
			f = f.next;
		}
		f.next = f.next.next;
		return rhead.next;
	}
}
