class Solution {
    public int findDuplicate(int[] nums) {
        
        int slower =0, faster =0;

        do{

            slower = nums[slower];
            faster = nums[nums[faster]];

        }
        while(slower!=faster);

        slower =0;

        while(slower!= faster)
        {
            slower = nums[slower];
            faster = nums[faster];
        }
        return slower;
        
    }
}