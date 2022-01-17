import java.util.*;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!myMap.containsKey(s.charAt(i))) {
                myMap.put(s.charAt(i), 1);
            } else {
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);


    }
}
