package entities;

import java.util.Stack;

public class RemoveOutermostParentheses {
	public static String removeOutermostParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				if(stack.size() > 0) {
					sb.append(ch);
				}
				stack.push(ch);
			} else {
				stack.pop();
				if(stack.size() > 0) {
					sb.append(ch);
				}
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "(()())(())";
		System.out.println(removeOutermostParentheses(s));
	}

}
