import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(arr1));
        System.out.println(target1);
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(twoSum(arr1, target1)));
        System.out.println("-----------------------------");
        System.out.println();

        int[] arr2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(arr2));
        System.out.println(target2);
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(twoSum(arr2, target2)));
        System.out.println("-----------------------------");
        System.out.println();

        int[] arr3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(arr3));
        System.out.println(target3);
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(twoSum(arr3, target3)));
        System.out.println("-----------------------------");
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }


//        int n = nums.length;
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (i == j) continue;
//                if (nums[i]+nums[j] == target) return new int[] {i,j};
//            }
//        }
        return new int[0];
    }
}
