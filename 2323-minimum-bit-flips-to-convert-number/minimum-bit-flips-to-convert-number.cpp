#include<bitset>
class Solution {
public:
    int minBitFlips(int start, int goal) {
        
        long int x = start^goal;
        bitset<32>bin(x);
        
       return bin.count();
    }
};