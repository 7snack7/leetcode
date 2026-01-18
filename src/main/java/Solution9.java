public class Solution9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int xcopy = x;
        int reverse = 0;
        while (xcopy>0) {
            reverse = reverse * 10 + xcopy % 10;
            xcopy /= 10;
        }
        return reverse == x;
    }
}
