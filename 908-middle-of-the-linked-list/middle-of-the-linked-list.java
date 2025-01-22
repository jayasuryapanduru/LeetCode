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
    public ListNode middleNode(ListNode head) {
        
        ListNode slowPointer = head;
        ListNode fastPointer = head;
      
        // Iterate through the list.
        // Fast pointer moves two steps at a time, slow pointer one step at a time.
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;       // Move slow pointer one step
            fastPointer = fastPointer.next.next;  // Move fast pointer two steps
        }
      
        // When fast pointer reaches the end of the list,
        // slow pointer will be at the middle element.
        return slowPointer;
    }
}