package nov17;
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
      
                ListNode ptr1=headA;
                ListNode ptr2=headB;
        if(ptr1==null||ptr2==null)
            return null;
        int len1=0;int len2=0;int diff=0;
        while(ptr1!=null)
        {
            len1++;
            ptr1=ptr1.next;
        }
         while(ptr2!=null)
        {
            len2++;
            ptr2=ptr2.next;
        }
        ptr1=headA;
        ptr2=headB;
        if(len1>len2)
        {
            diff=len1-len2;
                for(int i=0;i<diff;i++)
                {
                    ptr1=ptr1.next;
                }
        }
        else
        {
            diff=len2-len1;
            for(int i=0;i<diff;i++)
                ptr2=ptr2.next;
        }
        while(ptr1!=null &&ptr2!=null)
        {
            if(ptr1==ptr2)
                return ptr1;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        
        return null;
            
    }
}