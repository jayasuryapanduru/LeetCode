class Solution {
    public int[] runningSum(int[] nums) {
        
        int []running = new int[nums.length];
        //running[0] = nums[0];
        int sum=0;
        running[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
        sum += nums[i];    // Add current element to the running sum
        running[i] = sum;  // Store the running sum in the result array
        }
        return running;
    }
}