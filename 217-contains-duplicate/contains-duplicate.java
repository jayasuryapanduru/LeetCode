class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer>fre = new HashMap<>();

        for (int i:nums)
        {
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        
        for (Integer value : fre.values())
        {
            if (value>=2)
            {
                return true;
            }
        }
        return false;
        
    }
}