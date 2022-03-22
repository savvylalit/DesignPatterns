package com.sarv.behavioural.interpreter;

import java.util.Stack;

public class Application {
	public static void main(String[] args) {
		String statement = "7 3 - 2 1 + *";
		Stack<Expression> stack = new Stack<>();
		String[] tokenArray = statement.split(" ");
		for(String s : tokenArray) {
			if(ExpressionUtil.isOperator(s)) {
				Expression righExpression = stack.pop();
				Expression leftExpression = stack.pop();
				Expression operator = ExpressionUtil.getOperator(s,  leftExpression, righExpression);
				int result = operator.interpret();
				stack.push(new Number(result));
			}
			else {
				Expression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println(" { "+statement+"} : "+stack.pop().interpret()); // {7 3 - 2 1 + *} : 12
	}
}
