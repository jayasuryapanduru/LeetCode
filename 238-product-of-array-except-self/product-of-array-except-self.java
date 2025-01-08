class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int lpro=1, rpro=1;
       // int [] ans = new int [n];

        int []left = new int[n];
        left[0] = 1;
        for (int i=1;i<n;i++)
        {
            left[i] = left[i-1]*nums[i-1]; 
        }
        int []right = new int[n];

        right[n-1] = 1;

        for (int j=n-2;j>=0;j--)
        {
            right[j] = right[j+1]*nums[j+1];
        }
       // int []ans = new int [n];
        for (int i=0;i<n;i++)
        {
            nums[i] = left[i]*right[i];
        }
        return nums;

        
        
    }
}