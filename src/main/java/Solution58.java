public class Solution58 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while (s.charAt(right) == ' ') {
            right--;
        }
        int left = right - 1;
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }
}
