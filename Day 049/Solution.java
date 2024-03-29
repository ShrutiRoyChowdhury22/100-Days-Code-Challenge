class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         if(head==null || head.next==null)
             return head;
        ListNode currA = head;
        ListNode currB = head.next;
    
        while(currB!=null){
            if(currA.val==currB.val){
                currA.next= currB.next;
                currB=currB.next;
            }
            else{
                currA=currB;
                currB=currB.next;
            }
        }
        return head;
    }
