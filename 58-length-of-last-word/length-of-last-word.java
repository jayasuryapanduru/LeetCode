class Solution {
    public int lengthOfLastWord(String s) {
        
        int length =0;
        for (int i=s.length()-1;i>=0;i--)
        {
            if (Character.isAlphabetic(s.charAt(i)))
            {
                length++;
            }
            if (!Character.isAlphabetic(s.charAt(i)) && length!=0)
            {
                break;
            }
        }
        return length;
    }
}