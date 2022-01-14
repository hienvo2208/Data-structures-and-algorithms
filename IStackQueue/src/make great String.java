import java.util.Stack;

public class Solution2 {
    public static String makeGood(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> myStack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            if (myStack.isEmpty()) {
                myStack.push(arr[i]);
            } else {
                char top = myStack.peek();
                if (top != arr[i] && Character.toLowerCase(arr[i]) == Character.toLowerCase(top)) {
                    myStack.pop();
                } else {
                    myStack.push(arr[i]);
                }
            }
        }
        while (!myStack.isEmpty()) {
            stringBuilder.append(myStack.peek());
            myStack.pop();
        }
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        String s1 = "abBAcC";
        String s2 = "s";

        makeGood(s); // leetcode
        makeGood(s1);//""
        makeGood(s2);//"s"
    }
}
