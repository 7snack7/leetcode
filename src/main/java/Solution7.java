public class Solution7 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(463847412));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483412));
        System.out.println(reverse(1563847412));
    }

    public static int reverse(int x) {
        int minus = 1;
        if (x<0) {minus = -1;}
        int answer = 0;
        x *= minus;
        int count = 0;
        while (x>0) {
            if (count > 10 || count == 9 && answer > 214748364 ) return 0;
            answer = answer*10 + x%10;
            count ++;
            x /= 10;
        }
        return answer * minus;
    }
}
