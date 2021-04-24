package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbersTest {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode assemble = new ListNode(-1);
	    ListNode result = assemble;
	    int target = 0;
	    while(l1 != null || l2 != null) {
	    	target = target/10;
	        if(l1 != null) {
	        	target = target + l1.val;
	            l1 = l1.next;
	        }
	        if(l2 != null) {
	        	target = target + l2.val;
	            l2 = l2.next;
	        }
	        assemble.next = new ListNode(target%10);
	        assemble = assemble.next;
	    }
	    if(target >=10){
	    	assemble.next = new ListNode(1);
	    }
	    
	    return result.next;
	}
	
 
	public static void main(String[] args) {
		ListNode first1 = new ListNode(3);
		ListNode first2 = new ListNode(4, first1);
		ListNode first = new ListNode(2,first2);
		ListNode second1 = new ListNode(4);
		ListNode second2 = new ListNode(6, second1);
		ListNode second = new ListNode(5,second2);
		ListNode result = addTwoNumbers(first, second);
		System.out.println(result);
	
		first = new ListNode(0);
		second = new ListNode(0);
		result = addTwoNumbers(first, second);
		System.out.println(result);
		
		first = new ListNode(9);
		first = new ListNode(9, first);
		first = new ListNode(9, first);
		first = new ListNode(9, first);
		first = new ListNode(9, first);
		first = new ListNode(9, first);
		first = new ListNode(9, first);
		second = new ListNode(9);
		second = new ListNode(9, second);
		second = new ListNode(9, second);
		second = new ListNode(9, second);
		result = addTwoNumbers(first, second);
		System.out.println(result);
	}
}


