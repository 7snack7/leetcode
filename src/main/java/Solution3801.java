public class Solution3801 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,3,5},{2,4},{6,7,8}};
        System.out.println("{{1,3,5},{2,4},{6,7,8}}");
        System.out.println("-----------------------------");
        System.out.println(minMergeCost(arr1));
        System.out.println("-----------------------------");
        System.out.println();
        int[][] arr2 = {{1,1,5},{1,4,7,8}};
        System.out.println("{{1,1,5},{1,4,7,8}}");
        System.out.println("-----------------------------");
        System.out.println(minMergeCost(arr2));
        System.out.println("-----------------------------");
        System.out.println();
        int[][] arr3 = {{1},{3}};
        System.out.println("{{1},{3}}");
        System.out.println("-----------------------------");
        System.out.println(minMergeCost(arr3));
        System.out.println("-----------------------------");
        System.out.println();
        int[][] arr4 = {{1},{1}};
        System.out.println("{{1},{1}}");
        System.out.println("-----------------------------");
        System.out.println(minMergeCost(arr4));
        System.out.println("-----------------------------");
    }
    public static int minMergeCost(int[][] lists) {
        int n = lists.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lists[i].length; j++) {}
        }
        return 0;
    }
}
