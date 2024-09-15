class Solution {
public:
    string longestPalindrome(string s) {
        
        int n = s.length();
        if (n<=1) return s;
        int st=0,e=0;
        int max_len = 0;
        for (int i=0;i<n-1;i++)
        {
            int l=i,r=i;
            while(l>=0 && r<n && s[l]==s[r]) 
            {
                l--,r++;
            }
            int len = r-l-1;
            if (len>max_len)
            {
                max_len = len ;
                st = l+1;
                e = r+1;
            }
        }
         for (int i=0;i<n-1;i++)
        {
            int l=i,r=i+1;
            //n%2==1? r=i : r=i+1;
            while(l>=0 && r<n && s[l]==s[r])
            {
                 l--,r++;
              
            }
            int len = r-l-1;
            if (len>max_len)
            {
                max_len = len ;
                st = l+1;
                e = r+1;
            }
        }
        return s.substr(st,max_len);
    }
};