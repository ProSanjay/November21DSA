package nov25;

import java.util.ArrayList;;
class Solution {
    public boolean findTarget(TreeNode root, int k) {
       ArrayList<Integer> list=new ArrayList<>();
       inorderOFTree(root,list);
        int left=0;
        int right=list.size()-1;
        while(left<right)
        {
            if(list.get(left)+list.get(right)==k)return true;
            if(list.get(left)+list.get(right)<k){left++;}
             if(list.get(left)+list.get(right)>k){right--;}
        }
        return false;
        }
    
       public void inorderOFTree(TreeNode root,List<Integer> list)
       {
           if(root==null)
               return;
           inorderOFTree(root.left,list);
           list.add(root.val);
           inorderOFTree(root.right,list);
       }
}
