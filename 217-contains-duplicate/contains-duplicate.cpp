class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        
        // unordered_set<int>seen;
        // for(const int i:nums)
        // {
        //     if (!seen.insert(i).second)
        //     {
        //         return true;
        //     }
        // }

        sort(nums.begin(),nums.end());
        for (int i=1;i<nums.size();i++)
        {
            if (nums[i]==nums[i-1])
            {
                return true;
            }
        }
       return false;

    }
};