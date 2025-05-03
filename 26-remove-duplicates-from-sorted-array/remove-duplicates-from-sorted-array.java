class Solution {
    public int removeDuplicates(int[] nums) {
        
       int ind =0;

       for (int i=1;i<nums.length;i++)
       {
           if (nums[i]!=nums[ind])
           {
             nums[ind+1] = nums[i];
             ind++;
           }
       }
       return ind+1;
        
    }
}