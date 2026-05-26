public class Solution66 {
    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        for (int i : plusOne(digits1)) {
            System.out.print(i);
        }
        System.out.println();
        int[] digits2 = {4,3,2,1};
        for (int i : plusOne(digits2)) {
            System.out.print(i);
        }
        System.out.println();
        int[] digits3 = {9};
        for (int i : plusOne(digits3)) {
            System.out.print(i);
        }
        System.out.println();
    }
    

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i=n-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] answer = new int[n+1];
        answer[0] = 1;
        return answer;
    }
}
