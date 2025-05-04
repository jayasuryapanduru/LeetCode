class Solution {

    
    public boolean check(int[] nums) {

            int length = nums.length;
        int rCount =0;
        for (int i=0;i<length;i++)
        {
            if (nums[i]<=nums[(i+1)%length])
            {
                continue;
            }
            else{
                rCount++;
            }
        }
       return rCount>1 ? false:true;

    }
}