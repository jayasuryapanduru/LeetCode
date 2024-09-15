class Solution {
public:
    string longestPalindrome(string s) {
        
        int n = s.length();
        if (n<=1) return s;
        // if (n<=2){

        //     string l;
        //     l+=s[0];
        //     return l;
        // }
        int st=0,e=0;
        int max_len = 0;
        for (int i=0;i<n-1;i++)
        {
            int l=i,r=i;
            //n%2==1? r=i : r=i+1;
            while(l>=0 && r<n)
            {
                if (s[l]==s[r])
                {
                    l--,r++;
                }
                else 
                {
                    break;
                }
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
            while(l>=0 && r<n)
            {
                if (s[l]==s[r])
                {
                    l--,r++;
                }
                else 
                {
                    break;
                }
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