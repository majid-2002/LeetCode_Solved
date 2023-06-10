class LongestPalindrome {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 1; // Length of the longest palindromic substring
        int start = 0; // Starting index of the longest palindromic substring

        // Create a 2D boolean array
        boolean[][] dp = new boolean[n][n];

        // Initialize diagonal elements as true
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromic substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxLength = 2;
                start = i;
            }
        }

        // Check for palindromic substrings of length > 2
        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                    }
                }
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();

        String s1 = "babarammalayalamb";
        System.out.println(solution.longestPalindrome(s1)); // Output: "bab" or "aba"

        String s2 = "cbbd";
        System.out.println(solution.longestPalindrome(s2)); // Output: "bb"
    }
}
