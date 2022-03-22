package com.sarv.behavioural.interpreter;

public class Multiply implements Expression {

	private final Expression leftExpr;
	private final Expression rightExpr;
	
	public Multiply(Expression leftExpr, Expression rightExpr) {
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	@Override
	public int interpret() {
		return leftExpr.interpret() * rightExpr.interpret();
	}

}
