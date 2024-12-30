class Solution {
    public boolean isBalanced(String num) {
        

        int e =0;
        int o =0;
        for (int i=0;i<num.length();i++)
        {
            int d = Character.getNumericValue(num.charAt(i));
            e += (i%2==0)?d:0;
            o += (i%2==1)?d:0;
            
        }
        return o==e;
        
    }
}