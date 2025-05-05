class Solution {
    private void reverse(int []nums, int a, int b)
    {
        while(a<b)
        {
            final int t = nums[a];
            nums[a] = nums[b];
            nums[b]=t;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int l=nums.length;
        k %= l;

        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
        for (int i:nums)
        {
            System.out.print(i);
        }
    }
}