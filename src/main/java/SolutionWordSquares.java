import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionWordSquares {
    public static void main(String[] args) {
        String[] arr = new String[]{"able","area","echo","also"};
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");
        System.out.println(wordSquares(arr)); //[[able, area, echo, also], [area, able, also, echo]]
        System.out.println("-------------------------------");
        System.out.println();
        arr = new String[]{"code","cafe","eden","edge"};
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");
        System.out.println(wordSquares(arr)); //[]
        System.out.println("-------------------------------");
    }

    public static List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<>();
        int n = words.length;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j) continue;
                for (int k=0; k<n; k++) {
                    if (i==k || j==k) continue;
                    for (int l=0; l<n; l++) {
                        if (i==l || j==l || k==l) continue;

                        String top = words[i];
                        String left = words[j];
                        String right = words[k];
                        String bottom = words[l];

                        if (top.charAt(0) == left.charAt(0) &&
                                top.charAt(3) == right.charAt(0) &&
                                bottom.charAt(0) == left.charAt(3) &&
                                bottom.charAt(3) == right.charAt(3)) {

                            List<String> square = new ArrayList<>();
                            square.add(top);
                            square.add(left);
                            square.add(right);
                            square.add(bottom);
                            result.add(square);
                        }
                    }
                }
            }
        }

        result.sort((a, b) -> {
            for (int i=0; i<4; i++) {
                int compare = a.get(i).compareTo(b.get(i));
                if (compare != 0) return compare;
            }
            return 0;
        });

        return result;
    }
}
