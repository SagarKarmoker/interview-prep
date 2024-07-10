package StringProblem;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str1 = "{[(]]}";

        System.out.println(isValid(str1));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                // if it returns false after checking
                if(!((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']'))){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
