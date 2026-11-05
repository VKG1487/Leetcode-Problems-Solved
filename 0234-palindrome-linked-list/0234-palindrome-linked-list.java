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
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode forw=null;
        while(slow!=null){
            forw=slow.next;
            slow.next=prev;
            prev=slow;
            slow=forw;
        }
        fast=head;
        while(fast!=null&&prev!=null){
            if(fast.val!=prev.val)return false;
            fast=fast.next;
            prev=prev.next;
        }
        return true;
    }
}