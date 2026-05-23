public class Solution27 {
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(removeElement(nums1, val1));
        for (int num: nums1) {
            System.out.print(num + ", ");
        }
        System.out.println();

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
        for (int num: nums2) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length-1;
        if ((k<0)||(k==0 && nums[0]==val)) return 0; 
        int i=-1;
        while (i<k) {
            i++;
            if (val == nums[i]) {
                while (k>i && val == nums[k]){
                    k--;
                }
                if (k>i) {
                    nums[i] = nums[k];
                    k--;
                } else {
                    i--;
                    break;
                }
            }
        }
        return ++i;
    }
}
