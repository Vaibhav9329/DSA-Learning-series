package StackAndQueue.stack;

import java.util.Stack;

public class ValidParanthsis {
    public static boolean validPa(String s){
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else {
                if(ch == ')'){
                    if(st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                }

                if(ch == '}'){
                    if(st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                }

                if(ch == ']'){
                    if(st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]}";
        System.out.println(validPa(s));
    }
}
