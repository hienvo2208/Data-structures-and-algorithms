import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int result = 0;
        for (Map.Entry i : myMap.entrySet()) {
            int valueOfI = (int) i.getValue();
            if (max < valueOfI) {
                max = valueOfI;
                result = (int) i.getKey();
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        majorityElement(nums);
    }
}
