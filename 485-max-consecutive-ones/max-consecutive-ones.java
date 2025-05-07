class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count =0,k=0;

        if (nums.length==1)
        {
            return nums[0];
        }
     
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
               count++;
                
            }
            else
            {
                k = Math.max(k,count);
                count=0;
            }
        }
        k = Math.max(k,count);
        return k;
    }
}