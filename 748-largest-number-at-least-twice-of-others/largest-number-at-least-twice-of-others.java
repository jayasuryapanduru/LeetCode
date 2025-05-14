class Solution {
    public int dominantIndex(int[] nums) {
        
        int large = 0;
        int maxind=0;
        for (int i=0;i<nums.length;i++)
        {
            if (large <nums[i])
            {
                large = nums[i];
                maxind=i;
            }
        }
        int maxIn = 0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]!= large && large< (2*nums[i]))
            {

                return -1;
            }
        }
        return maxind;
    }
}