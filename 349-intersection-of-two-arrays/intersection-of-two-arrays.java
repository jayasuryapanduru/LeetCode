class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
         // LinkedList to store the result of intersection
        List<Integer> arr = new LinkedList<>();

        // HashSet to store elements of nums2 for fast lookup
        Set<Integer> set = new HashSet<>();
        for (int i:nums1)
        {
            set.add(i);
        }
        for (int i:nums2)
        {
            if (set.contains(i)){
            arr.add(i);
            set.remove(i);
            }
        }

        int []res = new int[arr.size()];
        
        for (int i=0;i<arr.size();i++)
        {
            res[i] = arr.get(i);
        }

       return res;
    }
    
}