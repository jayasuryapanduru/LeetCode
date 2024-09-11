class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        
        string str="";
        sort(strs.begin(),strs.end());
        string f = strs[0];
        string l = strs[strs.size()-1];
        for (int i=0;i<f.size();i++)
        {
            if (f[i]!=l[i])
            {
                break;
            }
            str+=f[i];
        }
        return str;
    }
};