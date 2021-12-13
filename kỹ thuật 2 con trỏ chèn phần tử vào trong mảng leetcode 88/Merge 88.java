public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k;

        for (k = m + n - 1; k >= 0; k--) {
            if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else if(nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }


        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

}
