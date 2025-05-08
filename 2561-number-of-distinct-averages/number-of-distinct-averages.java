class Solution {
    public int distinctAverages(int[] nums) {
        
        Arrays.sort(nums);

        // for (int i:nums)
        // {
        //     System.out.print(i+" ");
        // }\
        Set<Double> set = new HashSet<>();
        int left = 0, right=nums.length-1;
        Double avg = 0.0;
        while(left<right)
        {
            avg = (nums[left]+nums[right])/2.0;
           set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}