import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> myMap = new HashMap<>();
        for (Character sChar : s.toCharArray()) {
            myMap.put(sChar, myMap.getOrDefault(sChar, 0)+1);
        }
        if(s.length() != t.length()){
            return false;
        }else {
            for(int i=0;i<t.length();i++){
                char c = t.charAt(i);
                if(!myMap.containsKey(c) ||  myMap.get(c) == 0){
                    return false;
                }else {
                    myMap.put(c,myMap.get(c)-1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        isAnagram(s, t);
    }
}
