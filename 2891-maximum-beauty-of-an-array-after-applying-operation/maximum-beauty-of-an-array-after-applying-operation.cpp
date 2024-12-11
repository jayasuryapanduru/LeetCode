class Solution {
public:
    int maximumBeauty(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int i = 0, ans = 0;
        for (int j = 0; j < nums.size(); j++) {
            while (nums[j] - k > nums[i] + k)
                i++;
            ans = max(ans, j - i + 1);
        }
        return ans;
    }
};