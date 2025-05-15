import java.util.Stack;

public class valid{

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}", ""};

        for (String s : testCases) {
            System.out.println("Input: " + s + " -> Output: " + isValid(s));
        }
    }
}