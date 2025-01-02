class Solution {
    public void reverseString(char[] s) {
        
        int l=0,h = s.length-1;

        while(l<h)
        {
            char c = s[l];
            s[l] = s[h];
            s[h] = c;
            l++;
            h--;
        }
    }
}