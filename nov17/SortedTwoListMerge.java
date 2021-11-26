package nov17;
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode newNode=null;
        ListNode head=null;
        while(l1!=null && l2!=null)
        {     ListNode temp=new ListNode();
              
             if(l1.val<=l2.val)
             {
             
                 temp.val=l1.val; 
                  l1=l1.next;
             }
             else
             {
                 temp.val=l2.val;
                 l2=l2.next;
             }
                 
                  if(newNode==null)
                  {
                     newNode=temp;
                      head=temp;
                  }
                 else
                 {
                     newNode.next=temp;
                     newNode=newNode.next;
                 }
             
            
                 
        }
        while(l1!=null)
        {
            newNode.next=l1;
            l1=l1.next;
            newNode=newNode.next;
        }
         while(l2!=null)
        {
            newNode.next=l2;
            l2=l2.next;
             newNode=newNode.next;
        }
        
        
        return head;
        
    }
}