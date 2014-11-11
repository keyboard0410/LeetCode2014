package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public void evaluate(String[] str) {
		Stack<String> stack = new Stack<String>();
		int temp = 0;
		String operators = "+-*/";
		for(int i = 0; i < str.length; i++) {
			if(!operators.contains(str[i])) {
				stack.push(str[i]);
			}
			else if(operators.contains(str[i])) {
				int temp2 = Integer.valueOf(stack.pop());
				int temp1 = Integer.valueOf(stack.pop());
				if(str[i].equals("+")) {
					temp = temp1 + temp2;
				}
				else if(str[i].equals("-")) {
					temp = temp1 - temp2;
				}
				else if(str[i].equals("*")) {
					temp = temp1 * temp2;
				}
				else
					temp = temp1 / temp2;
				stack.push(String.valueOf(temp));
			}
		}
		System.out.println("Result = " + temp);
	}

	public static void main(String[] args) {
		String[] s = new String[] {"4", "13", "5", "/", "+"};
		new EvaluateReversePolishNotation().evaluate(s);

	}

}
