public class Solution26 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        System.out.println(removeDuplicates(nums1));
        System.out.println("---");

        for (int i: nums1) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
        System.out.println("---");

        for (int i: nums2) {
            System.out.println(i);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}
