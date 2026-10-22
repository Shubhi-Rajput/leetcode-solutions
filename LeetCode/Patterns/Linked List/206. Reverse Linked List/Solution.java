
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        int count = 0;
        ListNode temp = head;

        // Step 1: Count the nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Store values in reverse order
        int[] arr = new int[count];

        temp = head;
        int i = count - 1;

        while (temp != null) {
            arr[i] = temp.val;
            i--;
            temp = temp.next;
        }

        // Step 3: Update node values
        temp = head;
        i = 0;

        while (temp != null) {
            temp.val = arr[i];
            i++;
            temp = temp.next;
        }

        return head;
    }
}
