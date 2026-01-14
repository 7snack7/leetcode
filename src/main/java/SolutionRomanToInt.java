import java.util.HashMap;

public class SolutionRomanToInt {
    public static void main(String[] args) {
        System.out.println("III");
        System.out.println(romanToInt("III"));
        System.out.println("LVIII");
        System.out.println(romanToInt("LVIII"));
        System.out.println("MCMXCIV");
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> romanNumber = new HashMap<>();
        romanNumber.put('I',1);
        romanNumber.put('V',5);
        romanNumber.put('X',10);
        romanNumber.put('L',50);
        romanNumber.put('C',100);
        romanNumber.put('D',500);
        romanNumber.put('M',1000);

        int answer = 0;
        int previous = 0;
        for (int i=s.length()-1; i>=0; i--) {
            int symbol = romanNumber.get(s.charAt(i));
            if (symbol >= previous) {
                answer += symbol;
            } else {
                answer -= symbol;
            }
            previous = symbol;
        }
        return answer;
    }
}
