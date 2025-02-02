class Solution {
    boolean isSorted (int []arr)
    {
       final int n = arr.length;
        int r=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>arr[(i+1)%n] && ++r > 1)
            {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        
        return isSorted(nums);
    }
}