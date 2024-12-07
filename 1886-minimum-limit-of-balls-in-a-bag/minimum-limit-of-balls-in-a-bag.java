import java.util.Arrays;
class Solution {

    
    public int minimumSize(int[] nums, int maxOperations) {
        

        if (nums[0]==1)
        {
            return 1;
        }
        int l=0,r = 1; // Arrays.stream(nums).max().getAsInt();
        for (int i : nums)
        {
            r = Math.max(r,i);
        }
        while(l<r)
        {
            int mid = (l+r)/2, count=0;

            for (int i:nums)
            {
                count+=(i-1)/mid;
            }
            if (count>maxOperations)
            {
                l = mid+1;
            }
            else 
            {
                r = mid;
            }
        }
        return l;

    }
}