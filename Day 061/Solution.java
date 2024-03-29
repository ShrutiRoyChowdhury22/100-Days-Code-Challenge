class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = null;
        TreeNode head = null;
        TreeNode curr = root;
        while(!s.empty() || curr!=null)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }

            TreeNode top = s.pop();
            top.left = null;
            if(head==null){
                head=top;
            }

            if(prev!=null){
                prev.right=top;
            }

            prev=top;
            curr=top.right;
        }
        return head;
    }
}
