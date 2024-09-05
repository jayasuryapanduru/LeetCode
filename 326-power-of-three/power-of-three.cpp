class Solution {
public:
    bool isPowerOfThree(int n) {
        
        //return n > 0 && static_cast<int>(pow(3, 19)) % n == 0;
        if (n==0)
        {
            return false;
        }
        while (n%3==0)
        {
                n/=3;
        }
        return n==1;            

        
    }
};