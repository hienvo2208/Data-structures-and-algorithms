import java.util.*;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hp = new HashMap<>();
        String[] a = s.split(" ",0);
        if(pattern.length() != a.length) {
            return false;
        }

        for(int i=0;i<a.length;i++) {
            if(!hp.containsKey(pattern.charAt(i)) && !hp.containsValue(a[i])) {
                hp.put(pattern.charAt(i), a[i]);
            } else if(!Objects.equals(hp.get(pattern.charAt(i)), a[i])) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog"
    }
}
