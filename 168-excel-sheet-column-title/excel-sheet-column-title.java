class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder res = new StringBuilder();

        while(n>0)
        {
            n--;
            char c = (char)('A'+n%26);
            res.append(c);
            n/=26;
        }
        return res.reverse().toString();
    }
}