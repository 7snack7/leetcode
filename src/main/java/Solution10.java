public class Solution10 {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a"));
        System.out.println(isMatch("aa","a*"));
        System.out.println(isMatch("ab",".*"));
    }

    public static boolean isMatch(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();

        boolean[][] dp = new boolean[sLength+1][pLength+1];
        dp[0][0] = true;

        for (int j = 2; j <= pLength; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= pLength; j++) {

                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                if (pChar == '.' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {

                    dp[i][j] = dp[i][j - 2];

                    char prev = p.charAt(j - 2);

                    if (prev == '.' || prev == sChar) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[sLength][pLength];
    }
}
