class Solution {
    public boolean canChange(String start, String target) {
        
        int s = start.length();
        // int t = target.length();
        
        int i=0,j=0;
        while (i<s && j<s)
        {
            while (i<s && start.charAt(i)=='_') i++;
            while(j<s && target.charAt(j)=='_') j++;
            if (i==s && j==s)  { 
                return true;
            }
            if (i<s && j<s && start.charAt(i)!= target.charAt(j)) {
                return false;
            }
            if (i<s && start.charAt(i)=='L') {
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
         while (i<s && start.charAt(i)=='_') i++;
            while(j<s && target.charAt(j)=='_') j++;
        return i==s && j==s;

        
       
    }
}