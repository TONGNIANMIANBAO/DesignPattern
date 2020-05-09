package com.pattern.interpreter;

/**
 * terminal expression£∫ΩKΩY±Ìﬂ_ Ω
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
