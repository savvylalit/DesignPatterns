package com.sarv.behavioural.interpreter;

public class Substract implements Expression {

	private final Expression leftExpr;
	private final Expression rightExpr;
	
	public Substract(Expression leftExpr, Expression rightExpr) {
		this.leftExpr = leftExpr;
		this.rightExpr = rightExpr;
	}

	@Override
	public int interpret() {
		return leftExpr.interpret() - rightExpr.interpret();
	}

}
