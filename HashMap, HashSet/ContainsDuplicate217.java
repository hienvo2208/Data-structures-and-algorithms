import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> myHashSet = new HashSet<>();
        for (Integer i : nums) {

            if (myHashSet.contains(i) == true) {
                return true;
            }
            myHashSet.add(i);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        containsDuplicate(arr);
    }
}
