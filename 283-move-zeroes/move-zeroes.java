class Solution {
    public void moveZeroes(int[] nums) {
        
       
        int j=0, k = nums.length-1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]!=0)
            {
                nums[j++] = nums[i];
            }
        }
        for (int i=k;i>=j;i--)
        {
            nums[i]=0;
        }


    }
}