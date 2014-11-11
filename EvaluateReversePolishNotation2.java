package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation2 {
	public static void solution(String[] tokens) {
		Stack<String> stack = new Stack<String>();
		int result = 0;
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*"  && tokens[i] != "/" ) {
				stack.push(tokens[i]);
				
			}
			if(tokens[i] == "+") {
				int temp = Integer.parseInt(stack.pop());
				result = Integer.parseInt(stack.pop()) + temp;
				stack.push(String.valueOf(result));
				
			}
			else if(tokens[i] == "-") {
				int temp = (int)Integer.parseInt(stack.pop());
				result = (int)Integer.parseInt(stack.pop()) - temp;
				stack.push(String.valueOf(result));
			}
			else if(tokens[i] == "*"){
				int temp = (int)Integer.parseInt(stack.pop());
				result = (int)Integer.parseInt(stack.pop()) * temp;
				stack.push(String.valueOf(result));
			}
			else if(tokens[i] == "/"){
				int temp = (int)Integer.parseInt(stack.pop());
				result = (int)Integer.parseInt(stack.pop()) / temp;
				stack.push(String.valueOf(result));
			}
			
				
		}
		System.out.println(Integer.parseInt(stack.pop()));
		//return Integer.parseInt(stack.pop());
	}

	public static void main(String[] args) {
		String[] tokens = {"2", "1", "+", "3", "*"}; 
		solution(tokens);
	}

}
