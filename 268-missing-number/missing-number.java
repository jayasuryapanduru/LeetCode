class Solution {
    public int missingNumber(int[] nums) {
 
        int n = nums.length;

        // Formula of sum of n Natural numbers 
        // sum = (N * N+1)/ 2 ;
        int sum= n*(n+1)/2;
       
        int s2 = 0;
        for (int i=0;i<nums.length;i++)
        {
            s2+=nums[i];
        }
        return Math.abs(sum-s2);
    }
}
// Better Solution 


/* int n = nums.length;
    int[] hash = new int[n + 1];
    
    for (int i = 0; i < nums.length; i++) {
        hash[nums[i]] = 1;
    }
    
    for (int i = 0; i < hash.length; i++) {
        if (hash[i] == 0) return i;
    }

    return -1;
*/

// Brute force Solution 

        /*
        int max=0;
        for (int i:nums)
        {
            if (max<=i)
            {
                max = i;
            }
        }
        System.out.print(max);
        int k=0;
        for (int i=1;i<=max;i++)
        {
            int flag = 0;
            for (int j=0;j<nums.length-1;j++)
            {
                if (nums[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                k = i;
            }
        }
        return k;
        */