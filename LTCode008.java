class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}

public class LTCode008 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[6];
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;

        solution.merge(nums1, m, nums2, n);
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}