package leetcode_solutions;
// unsolved
public class Problem_002 {
	public int getLen(ListNode list){
		int len = 0;
		ListNode node = list;
		while(node != null){
			++len;
			node = node.next;
		}
		return len;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		int len1 = getLen(l1);
		int len2 = getLen(l2);
		int max = len1 > len2 ? len1 : len2;
		for (int i = 0; i < max; i++) {
			
		}
		ListNode head = new ListNode(0);
		while(l1 != null || l2 != null){
			ListNode result = new ListNode(0);
			int sum = l1.val + l2.val;
			int carry = sum >= 10 ? 1 : 0;
			result.val = sum > 10 ? sum : sum % 10;  
			head.next = result;
			
		}
		return head;
				
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
