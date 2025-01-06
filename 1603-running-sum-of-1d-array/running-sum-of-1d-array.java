class Solution {
    public int[] runningSum(int[] nums) {
        
        int []running = new int[nums.length];
        //running[0] = nums[0];
        int sum=0;
        running[0] = nums[0];
        for (int i=1;i<nums.length;i++)
        {
            for (int j=0;j<=i;j++)
            {
                sum+= nums[j];
            }
            running[i] = sum;
            sum=0;

        }
        return running;
    }
}