package uk.ac.belfastmet.returnTypes;

import java.util.Stack;



/**
 * @author CAS14105696
 * @param string expression (to be evaluated)
 */
public class BalancedBracketClass {
	
public static String balancedBrackets(String expression) {
    Stack<Character> s = new Stack<>();
    for(char c : expression.toCharArray()){
        switch(c){
            case '(': s.push(')');break;
            case '[': s.push(']');break;
            case '{': s.push('}');break;
            default:
                if(s.empty() || s.pop() != c) return "Not Balanced";
        }
    }
    return "Balanced";
}
}
