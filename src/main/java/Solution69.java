public class Solution69 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
        x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int max = 46340;
        int min = 0;
        int medium = (max - min)/2;;
        if (x >= max*max) return max;
        while (!((x == medium*medium)||((x > medium*medium)&&(x < (medium+1)*(medium+1))))) {
            if (x > medium*medium) {
                min = medium;
            } else {
                max = medium;
            }
            medium = min + (max - min)/2;
        }
        return medium;
    }
}
