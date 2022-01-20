public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        if (nums[0] > nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        else if (nums[0] <= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 4, 5};
        isMonotonic(arr);
    }
}
