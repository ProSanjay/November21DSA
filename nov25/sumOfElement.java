package nov25;

class Solution {
    static int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        sum=0;
        fa(root,low,high);
        return sum;
            
    }
    public void fa(TreeNode root, int low, int high)
    {
        if(root!=null)
        {
        if(root.val>=low&&root.val<=high)
            sum=sum+root.val;
        fa(root.left,low,high);
        fa(root.right,low,high);
        }
