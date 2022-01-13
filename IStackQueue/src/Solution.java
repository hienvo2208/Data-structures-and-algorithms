import java.util.Stack;

public class Solution {
    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    private static String buildString(String s) {
        Stack<Character> myStack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                myStack.push(s.charAt(i));
            }else if(!myStack.isEmpty()){
                myStack.pop();
            }
        }
        return String.valueOf(myStack);
    }


    public static void main(String[] args) {
        String s1 = "ab##";
        String s2 = "a#d#";
        System.out.println(backspaceCompare(s1, s2));

    }

}


















//    public static boolean backspaceCompare(String s, String t) {
//        Stack<Character> s1 = new Stack<>();
//        Stack<Character> s2 = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '#') {
//                if (!s1.isEmpty()) {
//                    s1.pop();
//                }
//            } else {
//                s1.push(s.charAt(i));
//            }
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            if (s.charAt(i) == '#') {
//                if (!s2.isEmpty()) {
//                    s2.pop();
//                }
//            } else {
//                s2.push(s.charAt(i));
//            }
//        }
//
//        if (s1.size() != s2.size()) {
//            return false;
//        }
//        if (s2.isEmpty() && s1.isEmpty()) {
//            return true;
//        }
//        for (int i = 0; i < s1.size(); i++) {
//            if (s1.elementAt(i) != s2.elementAt(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static Stack<Character> insertStack(String s, Stack<Character> myStack) {
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '#') {
//                if (!myStack.isEmpty()) {
//                    myStack.pop();
//                }
//            } else {
//                myStack.push(s.charAt(i));
//            }
//        }
//        return myStack;
//    }
//
//
//    /**
//     * Sử dụng String Builder
//     *
//     * @param s
//     * @param t
//     * @return
//     */
//
//    public static boolean backspaceCompare1(String s, String t) {
//        char[] a1 = s.toCharArray();
//        char[] a2 = t.toCharArray();
//        return process(a1).equals(process(a2));
//    }
//
//    public static String process(char[] arr) {
//        StringBuilder stringBuilder = new StringBuilder();
//        int count = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == '#') {
//                count++;
//            } else {
//                if (count > 0) {
//                    count--;
//                } else {
//                    stringBuilder.append(arr[i]);
//                }
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//
//    /**
//     * Cách này không sử dụng được đối với trường hợp có hai ##
//     *
//     * @param arr
//     * @return
//     */
//    private static String process2(char[] arr) {
//        StringBuilder stringBuilder = new StringBuilder();
//        boolean check = true;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == '#') {
//                check = false;
//            } else {
//                if (check) {
//                    stringBuilder.append(arr[i]);
//                } else {
//                    check = true;
//                }
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    public static boolean backspaceCompareV2(String s, String t) {
//        int sLen = s.length() - 1;
//        int tLen = t.length() - 1;
//        int sCount = 0;
//        int tCount = 0;
//        while (sLen >= 0 || tLen >= 0) {
//            while (sLen >= 0) {
//                if (s.charAt(sLen) == '#') {
//                    sCount++;
//                    sLen--;
//                } else if (sCount > 0) {
//                    sCount--;
//                    sLen--;
//                } else {
//                    break;
//                }
//            }
//            while (tLen >= 0) {
//                if (t.charAt(tLen) == '#') {
//                    tCount++;
//                    tLen--;
//                } else if (tCount > 0) {
//                    tCount--;
//                    tLen--;
//                } else {
//                    break;
//                }
//            }
//            if (sLen >= 0 && tLen >= 0) {
//                if (s.charAt(sLen) != t.charAt(tLen)) {
//                    return false;
//                }
//            } else if (sLen < 0 && tLen >= 0 || tLen < 0 && sLen >= 0) {
//                return false;
//            }
//            sLen--;
//            tLen--;
//        }
//        return true;
//    }

