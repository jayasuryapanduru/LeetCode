class Solution {
    public int singleNumber(int[] nums) {
       
      // Arrays.sort(nums);
       int xor = 0;
       
       for (int i:nums)
       {
         xor = xor^i;
       }
       return xor;

    }
}