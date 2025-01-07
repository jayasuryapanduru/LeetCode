class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size() / 2;
unordered_map<int, int> fre;

// Count frequencies of each element
for (int i : nums) {
    fre[i]++;
}

// Find the majority element
for (auto j : fre) {
    if (j.second > n) { // Majority condition
        return j.first; // Return the majority element
    }
}

// If no majority element exists, handle the case (optional based on problem constraints)
return -1; // Assuming -1 indicates no majority element

    }
};