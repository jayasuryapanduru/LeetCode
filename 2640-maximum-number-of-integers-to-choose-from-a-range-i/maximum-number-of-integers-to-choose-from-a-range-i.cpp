class Solution {
public:
    int maxCount(vector<int>& banned, int n, int maxSum) {
        
        set<int>arr;
        for (int i=0;i<banned.size();i++)
        {
            arr.insert(banned[i]);
        }
        int sum=0,count=0;
         for (int i=1;i<=n;i++)
            {
                if(arr.find(i)== arr.end() && sum+i <= maxSum)
                {
                    sum+=i;
                      count++;
                    
                }
            }
        return count;
    }
};