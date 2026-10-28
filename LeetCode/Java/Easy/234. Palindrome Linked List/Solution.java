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
    public boolean isPalindrome(ListNode head) {

        // Step 1: Reverse the linked list
        ListNode dummy = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode p = new ListNode(temp.val);
            temp = temp.next;
            p.next = dummy;
            dummy = p;
        }
        // Step 2: Compare the original and reversed lists
        boolean b = true;
        while (head != null) {
            if (head.val != dummy.val) {
                b = false;
                break;
            }
            head = head.next;
            dummy = dummy.next;
        }
        return b;
    }
}