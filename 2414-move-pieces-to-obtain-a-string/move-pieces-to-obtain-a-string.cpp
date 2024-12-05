class Solution {
public:
    bool canChange(string start, string target) {
          int s = start.length();
        // int t = target.length();
        
        int i=0,j=0;
        while (i<=s && j<=s)
        {
            while (i<s && start[i]=='_') i++;
            while(j<s && target[j]=='_') j++;
            if (i==s && j==s)  { 
                return true;
            }
            if (start[i]!= target[j]) {
                return false;
            }
            if (start[i]=='L') {
                if (j>i) {
                    return false;
                }
            }
            else  {
                if (j<i) {
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
};