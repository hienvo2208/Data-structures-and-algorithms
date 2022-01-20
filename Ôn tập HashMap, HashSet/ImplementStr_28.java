import java.util.Stack;

public class ImplementStr_28 {
    //
//    public static int strStr(String haystack, String needle) {   // haystack = hello, needle = ll
//        if(needle=="" || haystack =="" ){
//            return 0;
//        }else {
//            int p = 0;
//            char cN = needle.charAt(0);
//            int sizeOfNeedle = needle.length();
//            for (int i = 0; i < haystack.length(); i++) {
//                char cH = haystack.charAt(i);
//                if (cH == cN) {
//                    if (haystack.substring(i, i + sizeOfNeedle).equals(needle)) {
//                        p = i;
//                        return p;
//                    }
//                }
//            }
//            return -1;
//        }
//    }
    public static int strStr(String haystack, String needle) {
         return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String s ="";
        String t ="";
       strStr(s,t);
    }
}
