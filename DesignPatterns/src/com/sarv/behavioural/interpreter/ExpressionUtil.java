package com.sarv.behavioural.interpreter;

public class ExpressionUtil {

	public static boolean isOperator(String s) {
		if(s.equals("+") || s.equals("-") || s.equals("*"))
			return true;
		else
			return false;
	}
	
	public static Expression getOperator(String s, Expression left, Expression right) {

		switch(s) {
		case "+":
			return new Add(left, right);
		case "-":
			return new Substract(left, right);
		case "*":
			return new Multiply(left, right);
		}
		return null;
	}
}
