class Solution {

    private int getMin(int a,int b,int c)
    {
        return Math.min(a,Math.min(b,c));
    }
    public int maximumLength(String s) {
        int[][] top3freq = new int[26][3];
        for (int i = 0; i < 26; i++) Arrays.fill(top3freq[i], -1);

        char lastSeen = '*';
        int winLen = 0;

        // Find top-3 substring lengths for each character (a to z)
        for (char curr : s.toCharArray()) {
            int idx = curr - 'a';
            winLen = (curr == lastSeen) ? winLen + 1 : 1;
            lastSeen = curr;

            int minIndex = 0;
            for (int j = 1; j < 3; j++) {
                if (top3freq[idx][j] < top3freq[idx][minIndex]) {
                    minIndex = j;
                }
            }

            if (winLen > top3freq[idx][minIndex]) {
                top3freq[idx][minIndex] = winLen;
            }
        }

        // Find the maximum length of substrings
        int maxLen = -1;
        for (int i = 0; i < 26; i++) {
            maxLen = Math.max(maxLen, getMin(top3freq[i][0], top3freq[i][1], top3freq[i][2]));
        }

        return maxLen;
    }
}