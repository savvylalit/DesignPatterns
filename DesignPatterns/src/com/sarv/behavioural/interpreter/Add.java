package com.sarv.behavioural.interpreter;

public class Add implements Expression {

	private final Expression leftExpr;
	private final Expression rightExpr;
	
	public Add(Expression leftExpr, Expression rightExpr) {
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	@Override
	public int interpret() {
		return leftExpr.interpret() + rightExpr.interpret();
	}

}
