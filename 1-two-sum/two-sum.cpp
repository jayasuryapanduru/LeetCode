class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        int n=nums.size();
        vector<int>index;
        
       for(int i=0;i<n;i++)
       {
            for (int j=i+1;j<n;j++)
            {
                int sum = nums[i]+nums[j];
                if (sum==target)
                {
                    index.push_back(i);
                    index.push_back(j);
                }
            }
           
        }
        return index;
    }
};