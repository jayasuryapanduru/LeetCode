class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
        
        priority_queue<int> maxHeap;

        for (int i:gifts)
        {
            maxHeap.push(i);
        }
        for (int i=0;i<k;i++)
        {
            int sq = sqrt(maxHeap.top());
            maxHeap.pop();
            maxHeap.push(sq);
        }
        long long sum=0;
        while(!maxHeap.empty())
        {
            sum+=maxHeap.top();
            maxHeap.pop();
        }
        return sum;

    }
};