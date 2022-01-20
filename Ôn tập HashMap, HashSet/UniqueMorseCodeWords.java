import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
         int count = 0;
        Set<String> mySet = new HashSet<>();
         for(int i=0;i<words.length;i++){
            String sCode = convertCode(words[i]);
            if(!mySet.contains(sCode)){
                count++;
                mySet.add(sCode);
            }
         }
         return count;
    }
    static String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    public static String convertCode(String s) {
        String s1 ="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            s1 += arr[c-'a'];
        }
        return s1;
    }

    public static void main(String[] args) {


    }
}
