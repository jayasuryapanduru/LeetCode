class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        
        int n = nums.size();

        for (int i=0;i<n;i++)
        {
            if (nums[i]==0)
            {
                nums.push_back(nums[i]);
                nums.erase(find(nums.begin(),nums.end(),nums[i]));
            }
        }
    }
};