import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println("PAYPALISHIRING"+" 3");
        System.out.println(convert(s,3));
        System.out.println("PAHNAPLSIIGYIR");
        System.out.println("---------------------------");
        System.out.println("PAYPALISHIRING"+" 4");
        System.out.println(convert(s,4));
        System.out.println("PINALSIGYAHRPI");
        System.out.println("---------------------------");
        System.out.println("PAYPALISHIRING"+" 2");
        System.out.println(convert(s,2));
        System.out.println("PYAIHRNAPLSIIG");
        System.out.println("---------------------------");
        System.out.println("ABCD"+" 2");
        System.out.println(convert("ABCD",2));
        System.out.println("ACBD");
        System.out.println("---------------------------");
        System.out.println("A"+" 1");
        System.out.println(convert("A",1));
        System.out.println("A");
        System.out.println("---------------------------");
        System.out.println("AB"+" 1");
        System.out.println(convert("AB",1));
        System.out.println("AB");
        System.out.println("---------------------------");
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) { return s; }
        StringBuilder answer = new StringBuilder();
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        int indexRow = 0;
        boolean forward = true;
        for (int i = 0; i < s.length(); i++) {
            list.get(indexRow).add(s.charAt(i));
            if (forward) {
                indexRow++;
                if (indexRow == numRows) {
                    forward = false;
                    indexRow-=2;
                }
            } else  {
                indexRow--;
                if (indexRow == -1) {
                    forward = true;
                    indexRow+=2;
                }
            }
        }
        for (List<Character> characters : list) {
            for (Character character : characters) {
                answer.append(character);
            }
        }
        return answer.toString();
    }
}
