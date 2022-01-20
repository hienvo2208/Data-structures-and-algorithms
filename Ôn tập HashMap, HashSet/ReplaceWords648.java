import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReplaceWords648 {
    //    public static String processWord(List<String> dictionary, String s) {
//        String minRoot = "";
//        for (String root : dictionary) {
//            if (s.length() >= root.length()) {
//                if (s.substring(0, root.length()).equals(root)) {
//                    if (minRoot.isEmpty()) {
//                        minRoot = root;
//                    } else {
//                        if (minRoot.length() > root.length()) {
//                            minRoot = root;
//                        }
//                    }
//                }
//            }
//        }
//        return minRoot.isEmpty() ? s : minRoot;
//    }
    public static String processWord(List<String> dictionary, String s) {
        String minRoot = "";
        for(String root: dictionary){
            if(s.startsWith(root)){
                if(minRoot.isEmpty()){
                    minRoot = root;
                }else {
                    if(root.length()<minRoot.length()){
                        minRoot = root;
                    }
                }
            }
        }
        return minRoot.isEmpty() ? s:minRoot;
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String result = "";
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            result += " " + processWord(dictionary, s[i]);
        }
        return result.substring(1);
    }


    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("catt");
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        replaceWords(dictionary, sentence);
    }
}
