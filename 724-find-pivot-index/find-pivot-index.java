class Solution {
    public int pivotIndex(int[] nums) {
        
        int n=nums.length;
        int sum=0,lsum=0;
        for (int i:nums)
        {
            sum+=i;
        }
        for(int i=0;i<n;i++)
        {
           int rsum = sum-nums[i]-lsum;
           if (rsum==lsum)
           {
            return i;
           }
           lsum+=nums[i];
        }
        return -1;
    }
}