/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
    	ListNode fast = head;

    	while (fast.next != null && fast.next.next != null) {
    	    slow = slow.next;
    	    fast = fast.next.next;
    	}
    	ListNode second = slow.next;
    	slow.next = null;
    	
    	second = reverseList(second);
    	
    	while (second != null) {
    	    ListNode firstNext = head.next;
    	    ListNode secondNext = second.next;

    	    head.next = second;
    	    second.next = firstNext;

    	    head = firstNext;
    	    second = secondNext;
    	}
    }
    private ListNode reverseList(ListNode second) {
		ListNode prev = null;
		ListNode curr = second;
		ListNode next = null;
		while (curr != null) {
		    next = curr.next;
		    curr.next = prev;          
		    prev = curr;              
		    curr = next;              
		}

		return prev;
	}
}
