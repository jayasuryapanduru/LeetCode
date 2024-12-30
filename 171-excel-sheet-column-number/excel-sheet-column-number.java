class Solution {
    public int titleToNumber(String s) {
        
      int d=0,n=s.length();
      for (int i=0;i<n;i++)
      {
         
        int c = s.charAt(i);
        d = d*26+(c-'A'+1);

      }
      return d;



    }
}