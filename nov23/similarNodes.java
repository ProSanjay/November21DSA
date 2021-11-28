package nov23;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        sleafNode(root1,list1);
        sleafNode(root2,list2);
        if(list1.size()!=list2.size())
        {
            return false;
        }
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i)!=list2.get(i))
                return false;
        }
        return true;
    }
    public void sleafNode(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
            return ;
        if(root.left==null &&root.right==null)
            list.add(root.val);
        
         sleafNode(root.left,list);
         sleafNode(root.right,list);
         
        
        
    }
}