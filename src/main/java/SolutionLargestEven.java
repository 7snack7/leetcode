public class SolutionLargestEven {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println(largestEven("1112")); //1112
        System.out.println("-------------------------------");
        System.out.println(largestEven("221")); //22
        System.out.println("-------------------------------");
        System.out.println(largestEven("1")); //noll
        System.out.println("-------------------------------");
    }

    public static String largestEven(String s) {
        while ((!s.isEmpty())&&((s.charAt(s.length()-1) - '0')%2 != 0)) {
            s=s.substring(0,s.length()-1);
        }
        return s;
    }
}
