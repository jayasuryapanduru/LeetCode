import java.util.Arrays;
class Solution {

    
    public int minimumSize(int[] nums, int maxOperations) {
        

        if (nums[0]==1)
        {
            return 1;
        }
        int l=0,r = Arrays.stream(nums).max().getAsInt();
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