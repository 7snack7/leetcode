public class Solution3800 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println(minimumCost("01000", "10111", 10, 2, 2)); //16
        System.out.println("-------------------------------");
        System.out.println(minimumCost("001", "110", 2, 100, 100)); //6
        System.out.println("-------------------------------");
        System.out.println(minimumCost("1010", "1010", 5, 5, 5)); //0
        System.out.println("-------------------------------");
    }

    public static long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        if (s.length() != t.length()) return 0;
        int len = s.length();

        int diff01 = 0;
        int diff10 = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '0' && t.charAt(i) == '1') {
                diff01++;
                continue;
            }
            if (s.charAt(i) == '1' && t.charAt(i) == '0') {
                diff10++;
            }
        }

        return Math.min(diff01, diff10) * Math.min(2L * flipCost, swapCost)
                + Math.abs(diff01 - diff10) / 2 * Math.min(2L * flipCost, swapCost + crossCost)
                + Math.abs(diff01 - diff10) % 2 * flipCost;
    }
}