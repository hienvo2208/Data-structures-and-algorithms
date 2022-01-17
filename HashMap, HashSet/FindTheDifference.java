import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        // t.length > s.length =>
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            myMap.put(c, myMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!myMap.containsKey(c) || myMap.get(c) == 0) {
                return c;
            } else {
                myMap.put(c, myMap.get(c) - 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        findTheDifference(s, t);
    }
}


//    public char findTheDifference(String s, String t) {
//        int sumS = 0, sumT = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            sumS = sumS+(int)c;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char c = t.charAt(i);
//            sumT = sumT+(int)c;
//        }
//        char result = 0;
//        if(sumS > sumT){
//             result = (char)(sumS-sumT);
//        }else{
//             result = (char)(sumT-sumS);
//        }
//       return result;
//    }



