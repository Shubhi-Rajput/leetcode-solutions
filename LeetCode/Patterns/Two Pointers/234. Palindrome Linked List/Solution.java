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

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode second = reverse(slow);
        ListNode first = head;

        boolean b = true;

        // Step 3: Compare both halves
        while (second != null) {
            if (first.val != second.val) {
                b = false;
                break;
            }

            first = first.next;
            second = second.next;
        }
        return b;
    }

    public static ListNode reverse(ListNode h) {
        ListNode pre = null;
        ListNode cur = h;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
/*        // Step 1: Reverse the linked list
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
}*/