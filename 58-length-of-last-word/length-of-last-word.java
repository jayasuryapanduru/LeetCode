class Solution {
    public int lengthOfLastWord(String s) {
        
        String []a = s.split(" ");
        int l = a.length;
        return a[l-1].length();
    }
}