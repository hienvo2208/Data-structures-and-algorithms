import java.util.Stack;

public class LuyenTap {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && myStack.peek() == '(' || c == ']' && myStack.peek() == '[' || c == '}' && myStack.peek() == '{') {
                        myStack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        isValid(s);
    }
}
