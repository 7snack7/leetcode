public class Solution3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbtablud"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int maxLength = 1;
        int beginIndex = 0;
        for (int i=1; i< s.length(); i++) {
            if (!s.substring(beginIndex,i).contains(s.substring(i,i+1)) ) {
                maxLength = Math.max(maxLength,s.substring(beginIndex,i+1).length());
            } else {
                beginIndex = beginIndex + s.substring(beginIndex,i).indexOf(s.substring(i,i+1)) + 1;
            }
        }
        return maxLength;
    }
}
