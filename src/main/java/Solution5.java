public class Solution5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("dabad"));
    }

    public static String longestPalindrome(String s) {
        String answer = "";
        for (int i=0; i<s.length(); i++) {
            int start = i;
            int end = i;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            start++;
            end--;
            if (s.substring(start,end+1).length() > answer.length()) {
                answer = s.substring(start,end+1);
            }
            start = i;
            end = i+1;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            start++;
            end--;
            if (s.substring(start,end+1).length() > answer.length()) {
                answer = s.substring(start,end+1);
            }

        }
        return answer;
    }
}
