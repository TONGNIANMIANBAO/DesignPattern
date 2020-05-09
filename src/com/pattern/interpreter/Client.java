package com.pattern.interpreter;

/**
 * ½âáŒÆ÷Ä£Ê½
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Constant ct = new Constant(2);
		Variable x = new Variable();
		Variable y = new Variable();

		Context ctx = new Context();
		ctx.assign(x, 3);
		ctx.assign(y, 5);

		Plus plus = new Plus(y, x);
		System.out.println(plus.interpre(ctx));

		Minus min = new Minus(y, x);
		System.out.println(min.interpre(ctx));

		Plus plus2 = new Plus(new Minus(ct, y), new Minus(x, y));
		System.out.println(plus2.interpre(ctx));

		Minus min2 = new Minus(new Minus(ct, y), new Plus(x, ct));
		System.out.println(min2.interpre(ctx));
	}
}
