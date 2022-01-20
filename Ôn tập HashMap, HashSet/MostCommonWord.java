import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String [] words = paragraph.toLowerCase().split("\\W+");


        Map<String, Integer> myMap = new HashMap<>();
        String arr[] = paragraph.split(" ");
        for (String string : words) {
            myMap.put(string, myMap.getOrDefault(string, 0) + 1);
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        String result = "";
        int max = 0;
        for (String str : myMap.keySet()) {
            if (!set.contains(str) && max < myMap.get(str)) {
                max = myMap.get(str);
                result = str;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String paragraph = "";
        String[] banned = {"hit"};
        mostCommonWord(paragraph,banned);
    }
}
