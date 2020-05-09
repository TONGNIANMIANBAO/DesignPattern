package com.pattern.interpreter;

public class Plus implements Expression {
	Expression left;
	Expression right;

	public Plus(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpre(Context ctx) {
		return left.interpre(ctx) + right.interpre(ctx);
	}

}
