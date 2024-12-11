class Solution {
    public int maximumBeauty(int[] nums, int k) {
        // Determine the range of the array
        int max = 0;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum value in nums
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // Define the size of the frequency array
        // max + k ensures we cover the range for all potential `end` indices
        int rangeSize = max + k + 1;

        // Define the frequency array
        int[] freq = new int[rangeSize];

        // Update the frequency array using range marking
        for (int num : nums) {
            int start = Math.max(0, num - k);
            int end = Math.min(rangeSize - 1, num + k);

            freq[start]++;
            if (end + 1 < rangeSize) {
                freq[end + 1]--;
            }
        }

        // Calculate the prefix sum and track the maximum frequency
        int maxFrequency = 0;
        int currentFrequency = 0;

        for (int count : freq) {
            currentFrequency += count;
            maxFrequency = Math.max(maxFrequency, currentFrequency);
        }

        return maxFrequency;
    }
}
