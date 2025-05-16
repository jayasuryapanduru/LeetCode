class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        
        // Step 1: Convert each char to its position in the alphabet
        for (char ch : s.toCharArray()) {
            int val = ch - 'a' + 1;
            str.append(val);
        }
        
        // Step 2: First conversion to integer string
        String numStr = str.toString();
        
        // Step 3: Perform k transformations (sum of digits)
        while (k-- > 0) {
            int sum = 0;
            for (char digit : numStr.toCharArray()) {
                sum += digit - '0';
            }
            numStr = String.valueOf(sum); // Update for next iteration
        }
        
        return Integer.parseInt(numStr);
    }
}
