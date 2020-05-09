package com.pattern.interpreter;

public class Minus implements Expression{
	Expression left;
	Expression right;
	
	public Minus(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpre(Context ctx) {
		return left.interpre(ctx) - right.interpre(ctx);
	}

}
