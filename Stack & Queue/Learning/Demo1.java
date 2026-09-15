package Learning;

import java.util.Stack;

// Check for Balanced Parentheses

public class Demo1 {

    static boolean balancedParentesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // push opening brackets to stack  
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }

            else {
                // No matching bracket pair
                if (stack.isEmpty()) {
                    return false;
                }

                // check for matching pair
                char top = stack.pop();

                if (top == '(' && ch == ')' 
                    || top == '{' && ch == '}'
                    || top == '[' && ch == ']') 
                {
                    continue;
       
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
    
        String s = "(){}[{()]";
        
        System.out.println(balancedParentesis(s));
    } 
    
}