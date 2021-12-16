package nov3;

import java.util.Arrays;
// leetcode question
public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0){
            return false;
        }
       Arrays.sort(nums);
   int l = nums.length;
   for (int i=1; i<l; i++) {
      if (nums[i-1] == nums[i]) {
         return true;
      }
   }
   return false;
    }
}