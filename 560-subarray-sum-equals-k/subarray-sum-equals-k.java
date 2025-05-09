import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Base case: a sum of 0 occurs once
        
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num; // Update prefix sum
            
            // Check if (sum - k) exists in the map
            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k);
            }
            
            // Update the frequency of the current prefix sum
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}