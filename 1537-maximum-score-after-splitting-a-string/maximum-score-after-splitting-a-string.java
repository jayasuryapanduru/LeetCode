class Solution {
    public int maxScore(String s) {

        int max=0,zeroes=0,n = s.length();

        int ones = (int) s.chars().filter(k-> k=='1').count();
        
        for (int i=0;i<n-1;i++)
        {
            if (s.charAt(i)=='0') ++zeroes;
            else 
            ones--;
            max = Math.max(max,(ones+zeroes));
        }
        return max;
    

    }
}