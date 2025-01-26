class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length;
        int ones=0,max=0;
        
        for (int i=0;i<n;i++)
        {
           if (nums[i]==0)
           {
               max = Math.max(max,ones);
                ones=0;
           }
           else 
           {
                ones++;
           }
        
        }
        return Math.max(max,ones);
    }
}