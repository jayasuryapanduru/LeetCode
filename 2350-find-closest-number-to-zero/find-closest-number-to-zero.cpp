class Solution {
public:
    int findClosestNumber(vector<int>& nums) {

        int close =0;
        int d = INT_MAX;

        for (auto i:nums)
        {
            int y = abs(i);
            if (y<d || (y==d && i>close))
            {
                close = i;
                 d = y;
            }
        }
        return close;

    }
};