package leetcode;

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
    	int target1 = 0;
    	int target2 = 0;
    	int mult = 1;
    	LinkedList<Integer> firstInt = new LinkedList<>();
    	LinkedList<Integer> secondInt = new LinkedList<>();
    	ListNode check = new ListNode();
		target1 += l1.val * mult;
		mult *= 10;
    	check = l1.next;
    	firstInt.add(l1.val);
    	while (check != null) {
        	firstInt.add(check.val);
    		target1 += check.val * mult;
    		mult *= 10;
    		check = check.next;
    	}
    	System.out.println(firstInt.toString());
    	System.out.println(target1);

    	mult = 1;
		target2 += l2.val * mult;
		mult *= 10;
    	check = l2.next;
    	secondInt.add(l2.val);
    	while (check != null) {
    		secondInt.add(check.val);
    		target2 += check.val * mult;
    		mult *= 10;
    		check = check.next;
    	}	
    	System.out.println(secondInt.toString());
    	System.out.println(target2);

    	ListNode l3 = new ListNode(target1 + target2);
	    		    	
		return l3;	        
	}

	public static void main(String[] args) {
		ListNode first1 = new ListNode(3);
		ListNode first2 = new ListNode(4, first1);
		ListNode first = new ListNode(2,first2);
		ListNode second1 = new ListNode(4);
		ListNode second2 = new ListNode(6, second1);
		ListNode second = new ListNode(5,second2);
		ListNode result = addTwoNumbers(first, second);
		System.out.println(result.val);
	
		first = new ListNode(0);
		second = new ListNode(0);
		result = addTwoNumbers(first, second);
		System.out.println(result.val);
		
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
		System.out.println(result.val);
	}
}


