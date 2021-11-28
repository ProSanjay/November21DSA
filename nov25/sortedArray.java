package nov25;
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0,end=nums.length-1;
        
        return sortBinary(nums,start,end);
        
        
    }
    public TreeNode sortBinary(int[]nums,int start,int end)
    {
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=sortBinary(nums,start,mid-1);
        node.right=sortBinary(nums,mid+1,end);
        
        return node;
        
    }
}