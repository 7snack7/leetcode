public class Solution67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

        a = "1010";
        b = "1011";
        System.out.println(addBinary(a, b));
        
        a = "110010";
        b =  "10111";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int n = lenB;
        StringBuilder answer = new StringBuilder();
        boolean one = false;
        if (lenA > lenB) {
            n = lenA;
        }
        for (int i=0; i<=n; i++) {
            char c = '0';
            if (lenA >= i && lenB >= i) {
                if (a.charAt(lenA - i) == '1' && b.charAt(lenB - i) == '1') {
                    if (one) {
                        c = '1';
                    } else {
                        c = '0';
                    }
                    one = true;
                }
                if ((a.charAt(lenA - i) == '1' && b.charAt(lenB - i) == '0')
                    || (a.charAt(lenA - i) == '0' && b.charAt(lenB - i) == '1')) {
                    if (one) {
                        c = '0';
                    } else {
                        c = '1';
                    }
                }
                if (a.charAt(lenA - i) == '0' && b.charAt(lenB - i) == '0') {
                    if (one) {
                        c = '1';
                        one = false;
                    } else {
                        c = '0';
                    }
                }
            } else {
                if (lenA >= i) {
                    c = a.charAt(lenA - i);
                } else {
                    c = b.charAt(lenB - i);
                }
                if (one) {
                    if (c == '0') {
                        c = '1';
                        one = false;
                    } else {
                        c = '0';
                    }
                }
            }
            
            answer.append(c);
        }
        if (one) {
            answer.append('1');
        }
        return answer.reverse().toString();
    }
}
