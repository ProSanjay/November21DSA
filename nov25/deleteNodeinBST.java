package nov25;
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
        if(key<root.val)
            root.left=deleteNode(root.left,key);
        else if(key>root.val)
            root.right=deleteNode(root.right,key);
        else{
            if(root.left!=null &&root.right!=null)
            {
                int getMax=maxVal(root.left);
                root.val=getMax;
                root.left=deleteNode(root.left,getMax);
                return root;
            }
            else if(root.left!=null)
            {
                return root.left;
            }
            else if(root.right!=null)
            {
                return root.right;
            }
            else
                return null;
        }
        
        return root;
    }
    public int maxVal(TreeNode node)
    {   int max=Integer.MIN_VALUE;
        while(node!=null)
        {
            max=node.val;
            node=node.right;
        }
     return max;
    }
}