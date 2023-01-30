class Solution {
    public ListNode mergeNodes(ListNode head) {
    
        ListNode newNode = new ListNode(0);
        
        ListNode ptr = newNode;
        
        ListNode temp = head;
        
        temp=temp.next;
        
        int sum=0;
        while(temp!=null){
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
            temp=temp.next;
            sum=0;
        }
        return newNode.next;
    }
}
