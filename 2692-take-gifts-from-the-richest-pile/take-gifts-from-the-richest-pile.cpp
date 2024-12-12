class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
        
        while(k--)
        {
            auto i = max_element(gifts.begin(),gifts.end());
            *i = sqrt(*i);
        }
        return accumulate(gifts.begin(),gifts.end(),0LL);
        

    }
};