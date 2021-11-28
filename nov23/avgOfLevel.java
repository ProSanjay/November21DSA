package nov23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        ArrayList<Double> res=new ArrayList<>();    
		q.add(root);
		
		while(!q.isEmpty())
		{
             int size=q.size();
             long sum=0;
                for(int i=0;i<size;i++)
                {
                    TreeNode temp=q.poll();
                    sum=sum+temp.val;
                    if(temp.left!=null)
                    {
                        q.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        q.add(temp.right);
                    }
                }
                  res.add((double)sum/size);



        }
        return res;
    }
}
