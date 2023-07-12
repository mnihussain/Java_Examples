package problems.string;

import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) {
        String s = "Na{sir(s)i01@}]!s";
        String s1 = s.replaceAll("[^\\[\\](){}]", "");
        System.out.println(s1);
        System.out.println(isValid(s));
        //System.out.println(isValid("{({()})}"));
    }

    static boolean isValid(String s){
        char[] arr = s.toCharArray();
        Stack <Character> stack = new Stack<Character>();
        for(char c: arr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }else if(c == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }else if(c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}

