import java.util.HashMap;

public class TowSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                a[0] = hm.get(target - nums[i]);
                a[1] = i;
                return a;
            } else {
                hm.put(nums[i], i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        twoSum(a, 9);
    }
}
