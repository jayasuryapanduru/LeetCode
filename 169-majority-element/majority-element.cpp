class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        unordered_map<int,int>maj;

        for (auto i:nums)
        {
            maj[i]++;
        }
        int a = 0;
        for (auto i:maj)
        {
            if (i.second>(nums.size())/2)
            {
                return i.first;
            }
        }
        return a;

    }
};