package com.pattern.interpreter;

/**
 * terminal expression���K�Y���_ʽ
 * 
 * @author SEN.CHEN
 *
 */
public class Variable implements Expression {

	@Override
	public int interpre(Context ctx) {
		return ctx.lookup(this);
	}

}
