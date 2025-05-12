class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> fre = new HashMap<>();
        int n = nums.length;

        for (int i:nums)
        {
            fre.put(i,fre.getOrDefault(i,0)+1);
            if (fre.get(i)>n/2)
            {
                return i;
            }
        }
        return -1;
        
    }
}