import java.util.*;
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        

        if (banned[0]==1 && maxSum==1)
        {
            return 0;
        }
        Set<Integer> ar = new HashSet<>();

        for (int i : banned)
        {
            ar.add(i);
        }
        int j=0,sum=0,count=0;
        for (int i=1;i<=n;i++)
        {
            if(!ar.contains(i)&& sum+i <= maxSum)
            {
                sum+=i;
                count++;
            }
        }
       
       return count;
    }
}