class Solution {
    public String reverseVowels(String s) {
        

        int left = 0;
        int right = s.length()-1;

        StringBuilder str = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        while(left < right)
        {
            if (vowels.indexOf(str.charAt(left)) ==-1){
                left++;
            }
            else if (vowels.indexOf(str.charAt(right))==-1)
            {
                right--;
            }
            else 
            {
                char t = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right,t);
                left++;
                right--;
            }
        }
        return str.toString();
    }
}