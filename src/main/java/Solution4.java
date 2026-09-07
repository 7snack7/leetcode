public class Solution4 {
    public static void main(String[] args) {
        int[] nums1;
        int[] nums2;

        nums1 = new int[] {1, 3};
        nums2 = new int[] {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));

        nums1 = new int[] {1, 2};
        nums2 = new int[] {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

        nums1 = new int[] {1, 5};
        nums2 = new int[] {15, 50};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] nums = new int[len];
        int j = 0;
        int k = 0;
        for (int i=0; i < len; i++) {
            if (j >= nums1.length) {
                nums[i] = nums2[k];
                k++;
                continue;
            }
            if (k >= nums2.length) {
                nums[i] = nums1[j];
                j++;
                continue;
            }
            if (nums1[j] > nums2[k]) {
                nums[i] = nums2[k];
                k++;
            } else {
                nums[i] = nums1[j];
                j++;
            }
        }
        double answer = 0;
        if (len % 2 == 0) {
            answer = nums[len/2 - 1] + (nums[len/2] - nums[len/2 - 1]) / 2D;
        } else {
            answer = nums[len/2];
        }
        return answer;
    }
}
