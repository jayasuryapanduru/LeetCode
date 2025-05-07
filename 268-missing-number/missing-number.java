class Solution {
    public int missingNumber(int[] nums) {
        

        // optimal solution 

        int sum=0;

        for (int i=1;i<=nums.length;i++)
        {
            sum+=i;
        }
        int s2 = 0;
        for (int i=0;i<nums.length;i++)
        {
            s2+=nums[i];
        }
        return Math.abs(sum-s2);





















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
    }
}