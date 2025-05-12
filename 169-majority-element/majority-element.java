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
// optimal apporoach Boyer-Moore Voting Algorithm

/*
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Phase 1: Finding the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set the new candidate
            }
            count += (num == candidate) ? 1 : -1; 
        }

        // Phase 2: Verifying the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > nums.length / 2) ? candidate : -1; // Return the majority element
    }
}

*/