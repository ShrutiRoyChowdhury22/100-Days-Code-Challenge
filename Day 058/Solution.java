class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        for(int i=1;i<k;i++){
            p2=p2.next;
        }
        ListNode store=p2;

        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }

        int temp=store.val;
        store.val=p1.val;
        p1.val=temp;

        return head;
    }
}
