/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m=0;
        ListNode tempa=headA;
        while(tempa!=null){
            tempa=tempa.next;
            m++;
        }
        int n=0;
        ListNode tempb=headB;
        while(tempb!=null){
            tempb=tempb.next;
            n++;
        }
        tempa=headA;
        tempb=headB;
        if(m>n){
            tempa=headA;
            for(int i=0;i<m-n;i++){
                tempa=tempa.next;
            }
        }else{
            tempb=headB;
            for(int i=0;i<n-m;i++){
                tempb=tempb.next;
            }
        }
        while(tempa!=null && tempb!=null){
            if(tempa==tempb){
                return tempa;
            }
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return null;
    }
}