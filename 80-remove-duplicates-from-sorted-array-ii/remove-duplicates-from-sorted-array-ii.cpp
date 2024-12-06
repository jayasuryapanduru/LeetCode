class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        

            if (nums.size()<=2)
            {
                return nums.size();
            }
        int j=2;

        for (int i=2;i<nums.size();i++)
        {
            if (nums[i]!=nums[j-2])
            {
                
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    //    int i=0,j=1;

    //    while(j<=nums.size() && i<nums.size())
    //    {
    //         if (nums[i]==nums[j])
    //         {
    //             continue;
    //         }
    //         if (nums[i]!=nums[j])
    //         {
    //             if (nums[j]==nums[j+1])
    //             {
    //                 continue;
    //                 i=j+1, j+=2;
    //                 if (nums[i]==nums[j])
    //                 {
    //                     nums[nums.size()-1] = nums[j];
    //                     j++,i++;
    //                 }
    //             }
                
    //         }
    //         i++,j++;
    //    }
    //    return i;
    }
};